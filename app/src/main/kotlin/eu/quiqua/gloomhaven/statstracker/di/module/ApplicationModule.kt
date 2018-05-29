package eu.quiqua.gloomhaven.statstracker.di.module

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import eu.quiqua.gloomhaven.statstracker.Application
import javax.inject.Singleton

@Module
class ApplicationModule(var app: Application) {

    @Provides
    @Singleton
    fun provideApp(): Application = app

    @Provides
    @Singleton
    fun provideContext(): Context = app.baseContext

    @Provides
    fun provideModel(): String = "hello world"

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(app)
}