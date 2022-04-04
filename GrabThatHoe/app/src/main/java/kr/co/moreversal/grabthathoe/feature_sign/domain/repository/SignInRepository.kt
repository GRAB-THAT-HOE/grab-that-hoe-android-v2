package kr.co.moreversal.grabthathoe.feature_sign.domain.repository

import android.content.Context
import kr.co.moreversal.grabthathoe.common.Resource
import kr.co.moreversal.grabthathoe.common.Response

interface SignInRepository {
    suspend fun loginWithKakaoTalk(context: Context): Resource<Response<Any>>
}