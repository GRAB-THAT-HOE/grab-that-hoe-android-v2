package kr.co.moreversal.grabthathoe.features.join.fragment

import android.util.Log
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kr.co.moreversal.grabthathoe.R
import kr.co.moreversal.grabthathoe.base.BaseFragment
import kr.co.moreversal.grabthathoe.databinding.FragmentJoinBinding
import kr.co.moreversal.grabthathoe.features.join.viewmodel.JoinViewModel

@AndroidEntryPoint
class JoinFragment : BaseFragment<FragmentJoinBinding, JoinViewModel>(R.layout.fragment_join) {

    override val viewModel: JoinViewModel by viewModels()

    override fun start() {
        viewModel.name.observe(this) {
            Log.d("TestTag", it)
        }
    }
}