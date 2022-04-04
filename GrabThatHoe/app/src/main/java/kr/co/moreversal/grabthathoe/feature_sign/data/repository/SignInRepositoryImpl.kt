package kr.co.moreversal.grabthathoe.feature_sign.data.repository

import android.content.Context
import kr.co.moreversal.grabthathoe.common.Resource
import kr.co.moreversal.grabthathoe.common.Response
import kr.co.moreversal.grabthathoe.feature_sign.data.remote.SignApi
import kr.co.moreversal.grabthathoe.feature_sign.domain.repository.SignInRepository
import javax.inject.Inject

class SignInRepositoryImpl @Inject constructor(
    private val api: SignApi
): SignInRepository {
    override suspend fun loginWithKakaoTalk(context: Context): Resource<Response<Any>> {
        return api.loginWithKakaoTalk(context)
    }
}