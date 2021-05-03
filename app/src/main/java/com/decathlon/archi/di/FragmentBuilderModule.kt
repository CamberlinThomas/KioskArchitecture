package com.decathlon.archi.di

import com.decathlon.profile_presentation.ProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeFirstFragment(): ProfileFragment
}