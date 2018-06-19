package eu.quiqua.gloomhaven.statstracker.app

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import eu.quiqua.gloomhaven.statstracker.app.dagger.DaggerApplicationComponent
import javax.inject.Inject

class Application : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        inject()
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

    fun inject() {
        DaggerApplicationComponent
            .builder()
            .application(this)
            .build()
            .inject(this)
    }
}
