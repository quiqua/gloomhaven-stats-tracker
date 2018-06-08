package eu.quiqua.gloomhaven.statstracker.features.stats.viewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import eu.quiqua.gloomhaven.statstracker.features.stats.model.Stats

class StatsViewModel constructor(var stats: Stats) : ViewModel() {

    val mutableHp: MutableLiveData<Int> = MutableLiveData()
    val mutableXp: MutableLiveData<Int> = MutableLiveData()

    val hp: LiveData<Int>
        get() {
            if (mutableHp.value == null) {
                mutableHp.value = stats.hp
            }
            return mutableHp
        }

    fun increaseHp() {
        stats.hp += 1
        mutableHp.value = stats.hp
    }

    fun decreaseHp() {
        stats.hp -= 1
        mutableHp.value = stats.hp
    }

    val xp: LiveData<Int>
        get() {
            if (mutableXp.value == null) {
                mutableXp.value = stats.xp
            }
            return mutableXp
        }

    fun increaseXp() {
        stats.xp += 1
        mutableXp.value = stats.xp
    }

    fun decreaseXp() {
        stats.xp -= 1
        mutableXp.value = stats.xp
    }
}
