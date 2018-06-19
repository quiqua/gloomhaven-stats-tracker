package eu.quiqua.gloomhaven.statstracker.features.stats.viewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import eu.quiqua.gloomhaven.statstracker.features.stats.model.Stats

class StatsViewModel constructor(val stats: Stats) : ViewModel() {

    var hp: MutableLiveData<Int> = MutableLiveData()
    var xp: MutableLiveData<Int> = MutableLiveData()

    init {
        hp.value = stats.hp
        xp.value = stats.xp
    }

    fun increaseHp() = hp.postValue(stats.increaseHp())

    fun decreaseHp() = hp.postValue(stats.decreaseHp())

    fun increaseXp() = xp.postValue(stats.increaseXp())

    fun decreaseXp() = xp.postValue(stats.decreaseXp())
}
