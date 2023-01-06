package kr.co.moreversal.grabthathoe.features.plaza.fragment

import androidx.fragment.app.viewModels
import kr.co.moreversal.grabthathoe.R
import kr.co.moreversal.grabthathoe.base.BaseFragment
import kr.co.moreversal.grabthathoe.databinding.FragmentPlazaBinding
import kr.co.moreversal.grabthathoe.features.plaza.viewmodel.PlazaViewModel

class PlazaFragment : BaseFragment<FragmentPlazaBinding, PlazaViewModel>(R.layout.fragment_plaza) {

    override val viewModel: PlazaViewModel by viewModels()
    override val hasBottomNavigation: Boolean = true

    override fun start() {

    }

}