package com.decathlon.profile_domain

import com.decathlon.profile_domain.model.ProfileUI
import io.reactivex.rxjava3.core.Single

interface IGetProfileUseCase {

    fun execute(): Single<ProfileUI>

}