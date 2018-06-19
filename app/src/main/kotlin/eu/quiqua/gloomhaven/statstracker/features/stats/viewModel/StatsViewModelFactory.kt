package eu.quiqua.gloomhaven.statstracker.features.stats.viewModel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import eu.quiqua.gloomhaven.statstracker.features.stats.model.Stats
import javax.inject.Inject

class StatsViewModelFactory @Inject constructor(val stats: Stats) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(StatsViewModel::class.java) -> {
                StatsViewModel(stats) as T
            }
            else -> throw IllegalArgumentException(
                "${modelClass.simpleName} is an unknown type of view model"
            )
        }
    }
}
