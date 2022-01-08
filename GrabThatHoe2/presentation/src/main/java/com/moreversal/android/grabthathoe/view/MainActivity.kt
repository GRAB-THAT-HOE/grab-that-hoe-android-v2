package com.moreversal.android.grabthathoe.view

import androidx.activity.viewModels
import com.moreversal.android.grabthathoe.base.BaseActivity
import com.moreversal.android.grabthathoe.databinding.ActivityMainBinding
import com.moreversal.android.grabthathoe.viewmodel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val viewModel: MainViewModel by viewModels()

    override fun observerViewModel() {

    }
}