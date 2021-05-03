package com.decathlon.profile_data.datasource

import com.decathlon.profile_data.model.ProfileDTO
import io.reactivex.rxjava3.core.Single

interface IProfileRemoteDataSource {

    fun getProfile(): Single<ProfileDTO>

}