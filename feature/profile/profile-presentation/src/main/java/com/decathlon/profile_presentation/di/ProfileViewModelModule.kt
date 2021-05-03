package com.decathlon.profile_presentation.di

import androidx.lifecycle.ViewModel
import com.decathlon.presentation.di.ViewModelKey
import com.decathlon.profile_presentation.ProfileViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ProfileViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun bindMyViewModel(myViewModel: ProfileViewModel): ViewModel
}