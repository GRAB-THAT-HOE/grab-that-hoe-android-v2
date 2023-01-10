package kr.co.moreversal.grabthathoe.features.plaza.fragment

import android.widget.Toast
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kr.co.moreversal.grabthathoe.R
import kr.co.moreversal.grabthathoe.base.BaseFragment
import kr.co.moreversal.grabthathoe.databinding.FragmentPlazaBinding
import kr.co.moreversal.grabthathoe.extensions.repeatOnStarted
import kr.co.moreversal.grabthathoe.features.plaza.viewmodel.PlazaViewModel
import kr.co.moreversal.grabthathoe.features.plaza.viewmodel.PlazaViewModel.Event

@AndroidEntryPoint
class PlazaFragment : BaseFragment<FragmentPlazaBinding, PlazaViewModel>(R.layout.fragment_plaza) {

    override val viewModel: PlazaViewModel by viewModels()
    override val hasBottomNavigation: Boolean = true

    override fun start() {
        repeatOnStarted {
            viewModel.eventFlow.collect { event -> handleEvent(event) }
        }
    }

    // TODO EVENT 코드는 Sample 입니다. 삭제 바람.
    private fun handleEvent(event: Event) {
        when (event) {
            is Event.ShowToast -> Toast.makeText(requireContext(), event.text, Toast.LENGTH_SHORT).show()
        }
    }
}
