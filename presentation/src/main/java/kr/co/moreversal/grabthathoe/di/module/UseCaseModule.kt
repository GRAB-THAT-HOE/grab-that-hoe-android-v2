package kr.co.moreversal.grabthathoe.di.module

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    /*
    // TODO Sample Code 입니다.
    @Provides
    @Singleton
    fun provideMealUseCases(repository: MealRepository): MealUseCases =
        MealUseCases(
            getMeal = GetMeal(repository),
            getCalorieOfMeal = GetCalorieOfMeal(repository)
        )
     */
}
