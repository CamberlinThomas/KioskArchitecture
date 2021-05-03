package com.decathlon.profile_data.repository

import com.decathlon.profile_data.datasource.IProfileLocalDataSource
import com.decathlon.profile_data.datasource.IProfileRemoteDataSource
import com.decathlon.profile_data.mapper.IProfileMapper
import com.decathlon.profile_domain.IProfileRepository
import com.decathlon.profile_domain.model.ProfileUI
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class ProfileRepository @Inject constructor(
    private val localDataSource: IProfileLocalDataSource,
    private val remoteDataSource: IProfileRemoteDataSource,
    private val mapper: IProfileMapper
) : IProfileRepository {
    override fun getUserProfile(): Single<ProfileUI> {
        val singleProfile = localDataSource.getProfile()
            ?.let { Single.just(it) }
            ?: remoteDataSource.getProfile().doOnSuccess { localDataSource.saveProfile(it) }
        return singleProfile.map { mapper.toProfileUI(it) }
    }
}