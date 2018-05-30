package eu.quiqua.gloomhaven.statstracker.app

import android.app.Application
import eu.quiqua.gloomhaven.statstracker.app.dagger.ApplicationComponent
import eu.quiqua.gloomhaven.statstracker.app.dagger.ApplicationModule
import eu.quiqua.gloomhaven.statstracker.app.dagger.DaggerApplicationComponent

class Application : Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
    }
}
