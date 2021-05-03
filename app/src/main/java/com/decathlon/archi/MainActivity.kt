package com.decathlon.archi

import android.os.Bundle
import com.decathlon.archi.databinding.ActivityMainBinding
import com.decathlon.presentation.extensions.activity.replace
import com.decathlon.profile_presentation.ProfileFragment
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replace(ProfileFragment.newInstance(), binding.container.id)
    }
}