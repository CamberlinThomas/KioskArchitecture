package com.decathlon.profile_domain.di

import com.decathlon.profile_domain.GetProfileUseCase
import com.decathlon.profile_domain.IGetProfileUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class ProfileDomainModule {

    @Binds
    abstract fun bindGetProfileUseCase(getProfileUseCase: GetProfileUseCase): IGetProfileUseCase

}