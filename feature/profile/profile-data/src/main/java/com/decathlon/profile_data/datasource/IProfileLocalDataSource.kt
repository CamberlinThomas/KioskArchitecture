package com.decathlon.profile_data.datasource

import com.decathlon.profile_data.model.ProfileDTO

interface IProfileLocalDataSource {

    fun getProfile(): ProfileDTO?
    fun saveProfile(profile: ProfileDTO?)

}