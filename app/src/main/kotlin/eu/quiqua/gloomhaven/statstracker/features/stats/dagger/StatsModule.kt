package eu.quiqua.gloomhaven.statstracker.features.stats.dagger

import dagger.Module
import dagger.Provides
import eu.quiqua.gloomhaven.statstracker.features.stats.model.Stats

@Module
class StatsModule {

    @Provides
    fun provideStats(): Stats = Stats()
}
