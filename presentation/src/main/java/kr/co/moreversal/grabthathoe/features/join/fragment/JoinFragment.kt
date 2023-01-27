package kr.co.moreversal.grabthathoe.features.join.fragment

import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kr.co.moreversal.grabthathoe.R
import kr.co.moreversal.grabthathoe.base.BaseFragment
import kr.co.moreversal.grabthathoe.databinding.FragmentJoinBinding
import kr.co.moreversal.grabthathoe.extensions.repeatOnStarted
import kr.co.moreversal.grabthathoe.features.join.viewmodel.JoinViewModel
import kr.co.moreversal.grabthathoe.features.plaza.viewmodel.PlazaViewModel

@AndroidEntryPoint
class JoinFragment : BaseFragment<FragmentJoinBinding, JoinViewModel>(R.layout.fragment_join) {

    override val viewModel: JoinViewModel by viewModels()

    override fun start() {
        viewModel.cnt = 0
        repeatOnStarted {
            viewModel.eventFlow.collect { event -> handleEvents(event) }
        }
        observeLiveData()
    }

    private fun handleEvents(event: JoinViewModel.Event) {
        when (event) {
            is JoinViewModel.Event.ShowNext -> showPage(event.nextCount)
            is JoinViewModel.Event.ShowPrev -> showPage(event.prevCount)
            }

        }

    private fun observeLiveData() = with(viewModel) {
        name.observe(this@JoinFragment) {
            binding.btnNext.isEnabled = it.isNotBlank()
        }
        phoneNum.observe(this@JoinFragment) {
            binding.btnReceive.isEnabled = it.isNotBlank()
        }
        checkNum.observe(this@JoinFragment) {
            binding.btnCheckNum.isEnabled = it.isNotBlank()
        }
        birth.observe(this@JoinFragment) {

        }
    }

    private fun showPage(count: Int) {
        Log.d("TestFun", count.toString())
        when (count) {
            -1 -> {
                Toast.makeText(requireContext(), "로그인 페이지로 돌아가기", Toast.LENGTH_SHORT).show()
            }
            0 -> {
                binding.groupPhoneNum.isInvisible = true
                binding.groupName.isInvisible = false
                binding.groupNextBtn.isInvisible = false
            }
            1 -> {
                binding.groupName.isInvisible = true
                binding.groupNextBtn.isInvisible = true
                binding.groupPhoneNum.isInvisible = false
                binding.groupCheckNum.isInvisible = true
            }
            2 -> {
                binding.groupPhoneNum.isInvisible = false
                binding.groupCheckNum.isInvisible = false
                binding.groupProfile.isInvisible = true
                binding.groupNextBtn.isInvisible = true
                //TODO 인증 문자 로직
            }
            3 -> {
                binding.groupPhoneNum.isInvisible = true
                binding.groupCheckNum.isInvisible = true
                binding.groupProfile.isInvisible = false
                binding.groupNextBtn.isInvisible = false
            }
        }
    }
}