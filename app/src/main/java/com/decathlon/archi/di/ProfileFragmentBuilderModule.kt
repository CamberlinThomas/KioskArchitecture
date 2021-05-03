package com.decathlon.archi.di

import com.decathlon.profile_data.di.ProfileDataModule
import com.decathlon.profile_domain.di.ProfileDomainModule
import com.decathlon.profile_presentation.ProfileFragment
import com.decathlon.profile_presentation.di.ProfileViewModelModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module(includes= [ProfileViewModelModule::class, ProfileDomainModule::class, ProfileDataModule::class])
abstract class ProfileFragmentBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeProfileFragment(): ProfileFragment
}