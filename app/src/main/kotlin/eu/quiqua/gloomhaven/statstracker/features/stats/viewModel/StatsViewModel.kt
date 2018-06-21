package eu.quiqua.gloomhaven.statstracker.features.stats.viewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import eu.quiqua.gloomhaven.statstracker.features.stats.model.Stats

class StatsViewModel constructor(val stats: Stats) : ViewModel() {

    var hp: MutableLiveData<Int> = MutableLiveData()
    var xp: MutableLiveData<Int> = MutableLiveData()
    var decreasableHp: MutableLiveData<Boolean> = MutableLiveData()
    var decreasableXp: MutableLiveData<Boolean> = MutableLiveData()
    var increasableHp: MutableLiveData<Boolean> = MutableLiveData()


    init {
        hp.value = stats.hp
        xp.value = stats.xp
        decreasableHp.value = !stats.hasMinHp()
        decreasableXp.value = !stats.hasMinXp()
        increasableHp.value = !stats.hasMaxHp()
    }

    fun increaseHp() {
        hp.postValue(stats.increaseHp())
        decreasableHp.postValue(!stats.hasMinHp())
        increasableHp.postValue(!stats.hasMaxHp())
    }

    fun decreaseHp() {
        hp.postValue(stats.decreaseHp())
        decreasableHp.postValue(!stats.hasMinHp())
        increasableHp.postValue(!stats.hasMaxHp())
    }

    fun increaseXp() {
        xp.postValue(stats.increaseXp())
        decreasableXp.postValue(!stats.hasMinXp())
    }

    fun decreaseXp() {
        xp.postValue(stats.decreaseXp())
        decreasableXp.postValue(!stats.hasMinXp())
    }
}
