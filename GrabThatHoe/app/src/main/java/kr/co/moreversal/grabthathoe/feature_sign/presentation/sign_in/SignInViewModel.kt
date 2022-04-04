package kr.co.moreversal.grabthathoe.feature_sign.presentation.sign_in

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kr.co.moreversal.grabthathoe.feature_sign.domain.usecase.SignInUseCase
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val signInUseCase: SignInUseCase
): ViewModel() {

    private val _state = mutableStateOf(SignInState())
    val state: State<SignInState> = _state


}