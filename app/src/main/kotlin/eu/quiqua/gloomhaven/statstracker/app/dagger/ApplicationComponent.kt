package eu.quiqua.gloomhaven.statstracker.app.dagger

import android.content.Context
import android.content.SharedPreferences
import dagger.Component
import eu.quiqua.gloomhaven.statstracker.app.Application
import javax.inject.Singleton

@Singleton
@Component(modules = [(ApplicationModule::class)])
interface ApplicationComponent {

    val application: Application

    val context: Context

    val preferences: SharedPreferences
}
