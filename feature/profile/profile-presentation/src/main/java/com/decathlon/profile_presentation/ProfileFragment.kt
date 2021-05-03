package com.decathlon.profile_presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.decathlon.profile_presentation.databinding.FragmentProfileBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class ProfileFragment :  DaggerFragment() {

    @Inject
    lateinit var viewModel: ProfileViewModel

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentProfileBinding.inflate(inflater)
        .also { binding = it }
        .root


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.profileLiveData.observe(this, Observer {
            binding.profileNameValue.text = it.fullName
            binding.profileBirthDateValue.text = it.birthDate
        })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getProfile()
    }

    companion object {
        @JvmStatic
        fun newInstance() = ProfileFragment()
    }
}