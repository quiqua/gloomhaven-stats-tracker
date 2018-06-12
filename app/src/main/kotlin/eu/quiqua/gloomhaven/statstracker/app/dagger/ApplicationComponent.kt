package eu.quiqua.gloomhaven.statstracker.app.dagger

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import eu.quiqua.gloomhaven.statstracker.app.Application

@Component(modules = [AndroidInjectionModule::class, ApplicationModule::class, BuildersModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: android.app.Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(application: Application)
}
