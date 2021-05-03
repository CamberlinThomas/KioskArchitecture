package com.decathlon.archi.di

import com.decathlon.archi.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(
        modules = [
            FragmentBuilderModule::class
        ]
    )
    abstract fun contributeMainActivity(): MainActivity
}