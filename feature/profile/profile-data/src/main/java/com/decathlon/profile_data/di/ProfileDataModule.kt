package com.decathlon.profile_data.di

import com.decathlon.profile_data.datasource.IProfileLocalDataSource
import com.decathlon.profile_data.datasource.IProfileRemoteDataSource
import com.decathlon.profile_data.datasource.ProfileLocalDataSource
import com.decathlon.profile_data.datasource.ProfileRemoteDataSource
import com.decathlon.profile_data.mapper.IProfileMapper
import com.decathlon.profile_data.mapper.ProfileMapper
import com.decathlon.profile_data.repository.ProfileRepository
import com.decathlon.profile_domain.IProfileRepository
import dagger.Binds
import dagger.Module


@Module
abstract class ProfileDataModule {

    @Binds
    abstract fun bindProfileRepository(profileRepository: ProfileRepository): IProfileRepository

    @Binds
    abstract fun bindProfileLocalDataSource(profileLocalDataSource: ProfileLocalDataSource): IProfileLocalDataSource

    @Binds
    abstract fun bindProfileRemoteDataSource(profileRemoteDataSource: ProfileRemoteDataSource): IProfileRemoteDataSource

    @Binds
    abstract fun bindProfileMapper(profileMapper: ProfileMapper): IProfileMapper

}