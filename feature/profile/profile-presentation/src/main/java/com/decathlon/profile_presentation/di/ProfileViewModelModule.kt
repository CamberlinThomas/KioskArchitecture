package com.decathlon.profile_presentation.di

import com.decathlon.presentation.di.ViewModelFactoryModule
import com.decathlon.presentation.di.ViewModelKey
import com.decathlon.profile_presentation.ProfileViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [ViewModelFactoryModule::class])
abstract class ProfileViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun bindProfileViewModel(viewModel: ProfileViewModel): ProfileViewModel
}