package kr.co.moreversal.grabthathoe.features.join.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kr.co.moreversal.grabthathoe.base.BaseViewModel
import kr.co.moreversal.grabthathoe.features.plaza.viewmodel.PlazaViewModel
import kr.co.moreversal.grabthathoe.utils.MutableEventFlow
import kr.co.moreversal.grabthathoe.utils.asEventFlow
import javax.inject.Inject

@HiltViewModel
class JoinViewModel @Inject constructor() : BaseViewModel() {

    private val _eventFlow = MutableEventFlow<JoinViewModel.Event>()
    val eventFlow = _eventFlow.asEventFlow()

    val name = MutableLiveData<String>()
    val phoneNum = MutableLiveData<String>()
    val checkNum = MutableLiveData<String>()
    val birth = MutableLiveData<String>()

    var cnt = 0

    fun showNext() {
        event(Event.ShowNext(++cnt))
    }
    fun showPrev() {
        event(Event.ShowPrev(--cnt))
    }

    private fun event(event: Event) = viewModelScope.launch {
        _eventFlow.emit(event)
    }


    sealed class Event {
        data class ShowNext(val nextCount: Int) : Event()
        data class ShowPrev(val prevCount: Int) : Event()
    }

}