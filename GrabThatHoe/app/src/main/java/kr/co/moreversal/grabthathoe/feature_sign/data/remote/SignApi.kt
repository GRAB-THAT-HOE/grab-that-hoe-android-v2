package kr.co.moreversal.grabthathoe.feature_sign.data.remote

import android.content.Context
import kr.co.moreversal.grabthathoe.common.Resource
import kr.co.moreversal.grabthathoe.common.Response

interface SignApi {

    suspend fun loginWithKakaoTalk(context: Context): Resource<Response<Any>>
}