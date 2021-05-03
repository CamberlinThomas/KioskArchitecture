package com.decathlon.profile_data.datasource

import com.decathlon.profile_data.model.ProfileDTO
import javax.inject.Inject

class ProfileLocalDataSource @Inject constructor(): IProfileLocalDataSource {

    override fun getProfile() = CURRENT_PROFILE

    override fun saveProfile(profile: ProfileDTO?) {
        CURRENT_PROFILE = profile
    }

    companion object {
        var CURRENT_PROFILE: ProfileDTO? = null
    }
}