package com.decathlon.presentation.extensions.activity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.decathlon.presentation.extensions.fragmentmanager.transaction

fun FragmentActivity.add(fragment: Fragment, container: Int) {
    supportFragmentManager.transaction { add(container, fragment) }
}

fun FragmentActivity.replace(fragment: Fragment, container: Int) {
    supportFragmentManager.transaction { replace(container, fragment) }
}