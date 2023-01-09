package kr.co.moreversal.grabthathoe.features.doran.fragment

import androidx.fragment.app.viewModels
import kr.co.moreversal.grabthathoe.R
import kr.co.moreversal.grabthathoe.base.BaseFragment
import kr.co.moreversal.grabthathoe.databinding.FragmentDoranBinding
import kr.co.moreversal.grabthathoe.features.doran.viewmodel.DoranViewModel

class DoranFragment : BaseFragment<FragmentDoranBinding, DoranViewModel>(R.layout.fragment_doran) {

    override val viewModel: DoranViewModel by viewModels()
    override val hasBottomNavigation: Boolean = true

    override fun start() {
    }
}
