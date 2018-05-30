package eu.quiqua.gloomhaven.statstracker.app.dagger

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import eu.quiqua.gloomhaven.statstracker.app.Application
import javax.inject.Singleton

@Module
class ApplicationModule(var application: Application) {

    @Provides
    @Singleton
    fun provideApplication(): Application = application

    @Provides
    @Singleton
    fun provideContext(): Context = application.baseContext

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(application)
}
