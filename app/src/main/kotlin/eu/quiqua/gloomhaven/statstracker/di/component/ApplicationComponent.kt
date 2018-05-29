package eu.quiqua.gloomhaven.statstracker.di.component

import android.content.Context
import android.content.SharedPreferences
import eu.quiqua.gloomhaven.statstracker.Application
import eu.quiqua.gloomhaven.statstracker.di.module.ApplicationModule

import dagger.Component
import eu.quiqua.gloomhaven.statstracker.ui.stats.StatsViewModel
import javax.inject.Singleton

@Singleton
@Component(modules = [(ApplicationModule::class)])
interface ApplicationComponent {

    val app: Application

    val context: Context

    val preferences: SharedPreferences

    val model: String

    fun inject(statsViewModel: StatsViewModel)
}
