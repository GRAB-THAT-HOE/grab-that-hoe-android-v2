package kr.co.moreversal.grabthathoe.feature_sign.presentation.sign_in

import kr.co.moreversal.grabthathoe.common.Response

data class SignInState(
    val isLoading: Boolean = false,
    val token: String = "",
    val error: String = ""
)