package eu.quiqua.gloomhaven.statstracker.features.stats.dagger

import dagger.Module
import dagger.Provides

@Module
class StatsModule() {

    @Provides
    fun getModel(): String = "hello world"

}
