package eu.quiqua.gloomhaven.statstracker.features.stats.dagger

import dagger.Subcomponent
import dagger.android.AndroidInjector
import eu.quiqua.gloomhaven.statstracker.features.stats.view.StatsActivity

@Subcomponent(modules = [StatsModule::class])
interface StatsSubComponent : AndroidInjector<StatsActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<StatsActivity>()
}
