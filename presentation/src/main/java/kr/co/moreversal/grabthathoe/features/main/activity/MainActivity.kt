package kr.co.moreversal.grabthathoe.features.main.activity

import androidx.activity.viewModels
import kr.co.moreversal.grabthathoe.R
import kr.co.moreversal.grabthathoe.base.BaseActivity
import kr.co.moreversal.grabthathoe.databinding.ActivityMainBinding
import kr.co.moreversal.grabthathoe.features.main.viewmodel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

    override val viewModel: MainViewModel by viewModels()

    override fun start() {

    }
}
