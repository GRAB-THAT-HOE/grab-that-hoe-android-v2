package kr.co.moreversal.grabthathoe.feature_sign.presentation.sign_in

import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import kr.co.moreversal.grabthathoe.common.Resource
import kr.co.moreversal.grabthathoe.common.Response
import kr.co.moreversal.grabthathoe.feature_sign.domain.usecase.SignInUseCase
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val signInUseCase: SignInUseCase
): ViewModel() {

    private val _state = mutableStateOf(SignInState())
    val state: State<SignInState> = _state

    private fun signIn() {
        /*signInUseCase(context).onEach { result ->
            when(result) {
                is Resource.Success -> {
                    //_state.value = SignInState(result = Response())
                }
                is Resource.Error -> {

                }
                is Resource.Loading -> {

                }
            }
        }*/
    }

}