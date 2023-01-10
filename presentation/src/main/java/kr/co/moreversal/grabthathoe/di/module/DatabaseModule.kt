package kr.co.moreversal.grabthathoe.di.module

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kr.co.moreversal.data.local.AppDatabase
import kr.co.moreversal.data.local.dao.SampleDao
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase = Room
        .databaseBuilder(context, AppDatabase::class.java, "grab_that_hoe.db")
        .build()

    @Singleton
    @Provides
    fun provideSampleDao(appDatabase: AppDatabase): SampleDao = appDatabase.sampleDao()
}
