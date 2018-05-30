package eu.quiqua.gloomhaven.statstracker.features.stats.model

import android.arch.lifecycle.AndroidViewModel
import eu.quiqua.gloomhaven.statstracker.app.Application
import eu.quiqua.gloomhaven.statstracker.features.stats.dagger.DaggerStatsComponent
import eu.quiqua.gloomhaven.statstracker.features.stats.dagger.StatsModule
import javax.inject.Inject

class StatsViewModel @Inject constructor(application: android.app.Application) : AndroidViewModel(application) {

    init {
        DaggerStatsComponent.builder()
                .applicationComponent((application as Application).applicationComponent)
                .statsModule(StatsModule())
                .build()
                .inject(this)
    }

    @Inject
    lateinit var model: String

    fun getStats(): String = model
}
