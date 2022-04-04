package kr.co.moreversal.grabthathoe.feature_sign.presentation.sign_in

import kr.co.moreversal.grabthathoe.common.Response

data class SignInState(
    val isLoading: Boolean = false,
    val result: Response<Any> = Response(0, "", "null"),
    val error: String = ""
)