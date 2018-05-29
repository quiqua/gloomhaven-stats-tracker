package eu.quiqua.gloomhaven.statstracker

import android.app.Application
import eu.quiqua.gloomhaven.statstracker.di.component.DaggerApplicationComponent
import eu.quiqua.gloomhaven.statstracker.di.module.ApplicationModule

class Application : Application() {

    val component by lazy { DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build() }

    override fun onCreate() {
        super.onCreate()
    }
}