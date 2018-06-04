package eu.quiqua.gloomhaven.statstracker.features.stats.dagger

import dagger.Component
import eu.quiqua.gloomhaven.statstracker.app.dagger.ApplicationComponent
import eu.quiqua.gloomhaven.statstracker.base.dagger.scopes.ActivityScope
import eu.quiqua.gloomhaven.statstracker.features.stats.viewmodel.StatsViewModel

@ActivityScope
@Component(dependencies = [(ApplicationComponent::class)], modules = [(StatsModule::class)])
interface StatsComponent {

    val model: String

    fun inject(statsViewModel: StatsViewModel)
}
