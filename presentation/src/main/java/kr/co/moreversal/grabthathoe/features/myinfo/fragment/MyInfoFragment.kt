package kr.co.moreversal.grabthathoe.features.myinfo.fragment

import androidx.fragment.app.viewModels
import kr.co.moreversal.grabthathoe.R
import kr.co.moreversal.grabthathoe.base.BaseFragment
import kr.co.moreversal.grabthathoe.databinding.FragmentMyinfoBinding
import kr.co.moreversal.grabthathoe.features.myinfo.viewmodel.MyInfoViewModel

class MyInfoFragment : BaseFragment<FragmentMyinfoBinding, MyInfoViewModel>(R.layout.fragment_myinfo) {

    override val viewModel: MyInfoViewModel by viewModels()
    override val hasBottomNavigation: Boolean = true

    override fun start() {
    }
}
