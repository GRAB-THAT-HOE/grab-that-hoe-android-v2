package kr.co.moreversal.grabthathoe.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.moreversal.grabthathoe.feature_sign.data.remote.SignApi
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideSignApi(): SignApi {
        return Retrofit.Builder()
            .baseUrl()
    }
}