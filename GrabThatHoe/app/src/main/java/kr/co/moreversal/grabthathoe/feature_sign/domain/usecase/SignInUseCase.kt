package kr.co.moreversal.grabthathoe.feature_sign.domain.usecase

import android.content.Context
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kr.co.moreversal.grabthathoe.common.Resource
import kr.co.moreversal.grabthathoe.common.Response
import kr.co.moreversal.grabthathoe.feature_sign.domain.repository.SignInRepository
import retrofit2.HttpException
import java.io.IOException

class SignInUseCase (
    private val repository: SignInRepository
) {
    operator fun invoke(context: Context): Flow<Resource<Response<Any>>> = flow {
        try {
            emit(Resource.Loading())
            val result = repository.loginWithKakaoTalk(context).data
            emit(Resource.Success(result))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured!"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}