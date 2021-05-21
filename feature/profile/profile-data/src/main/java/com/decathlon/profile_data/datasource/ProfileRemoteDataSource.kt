package com.decathlon.profile_data.datasource

import com.decathlon.profile_data.model.ProfileDTO
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class ProfileRemoteDataSource @Inject constructor(): IProfileRemoteDataSource {
    override fun getProfile(): Single<ProfileDTO> = Single.just(
        ProfileDTO(
            "Fabio",
            "Quartararo",
            924604786000,
            1234,
            1429526386000
        )
    )
}