package com.decathlon.profile_domain

import com.decathlon.profile_domain.model.ProfileUI

interface IProfileRepository {

    fun getUserProfile(): io.reactivex.rxjava3.core.Single<ProfileUI>

}