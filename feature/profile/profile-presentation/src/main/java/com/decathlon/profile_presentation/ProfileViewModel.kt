package com.decathlon.profile_presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.decathlon.profile_domain.IGetProfileUseCase
import com.decathlon.profile_domain.model.ProfileUI
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class ProfileViewModel @Inject constructor(private val getProfileUseCase: IGetProfileUseCase) : ViewModel() {

    val TAG = ProfileViewModel::class.java.simpleName

    private val _profileLiveData: MutableLiveData<ProfileUI> = MutableLiveData()
    val profileLiveData = _profileLiveData as LiveData<ProfileUI>


    fun getProfile() {
        getProfileUseCase.execute()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { _profileLiveData.value = it },
                { Log.e(TAG, it.toString()) })
    }


}