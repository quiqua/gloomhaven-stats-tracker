package eu.quiqua.gloomhaven.statstracker.app.dagger

import android.content.Context
import dagger.Module
import dagger.Provides
import eu.quiqua.gloomhaven.statstracker.app.Application
import eu.quiqua.gloomhaven.statstracker.features.stats.dagger.StatsSubComponent

@Module(subcomponents = [(StatsSubComponent::class)])
class ApplicationModule {

    @Provides
    fun provideContext(application: Application): Context = application.applicationContext
}
