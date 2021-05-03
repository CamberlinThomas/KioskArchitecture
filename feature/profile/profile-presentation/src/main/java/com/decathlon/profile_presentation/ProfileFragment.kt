package com.decathlon.profile_presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.decathlon.profile_presentation.databinding.FragmentProfileBinding
import javax.inject.Inject

class ProfileFragment : Fragment() {

    @Inject
     lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: ProfileViewModel
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentProfileBinding.inflate(inflater)
        .also { binding = it }
        .root


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this, viewModelFactory).get(ProfileViewModel::class.java)

        viewModel.profileLiveData.observe(this, Observer {
            binding.profileNameValue.text = it.fullName
            binding.profileBirthDateValue.text = it.birthDate
        })
    }

    companion object {
        @JvmStatic
        fun newInstance() = ProfileFragment()
    }
}