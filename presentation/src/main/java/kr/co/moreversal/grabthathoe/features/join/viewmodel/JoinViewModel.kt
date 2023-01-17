package kr.co.moreversal.grabthathoe.features.join.viewmodel

import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kr.co.moreversal.grabthathoe.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class JoinViewModel @Inject constructor() : BaseViewModel() {

    val name = MutableLiveData<String>()



}