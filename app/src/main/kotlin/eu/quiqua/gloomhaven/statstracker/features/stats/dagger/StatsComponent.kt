package eu.quiqua.gloomhaven.statstracker.features.stats.dagger

import dagger.Component
import eu.quiqua.gloomhaven.statstracker.app.dagger.ApplicationComponent
import eu.quiqua.gloomhaven.statstracker.base.dagger.scopes.ActivityScope
import eu.quiqua.gloomhaven.statstracker.features.stats.model.Stats
import eu.quiqua.gloomhaven.statstracker.features.stats.viewModel.StatsViewModel

@ActivityScope
@Component(dependencies = [(ApplicationComponent::class)], modules = [(StatsModule::class)])
interface StatsComponent {

    val stats: Stats

    fun inject(statsViewModel: StatsViewModel)
}
