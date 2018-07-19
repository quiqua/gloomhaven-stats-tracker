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
    var disarmed: MutableLiveData<Boolean> = MutableLiveData()
    var immobilized: MutableLiveData<Boolean> = MutableLiveData()
    var invisible: MutableLiveData<Boolean> = MutableLiveData()
    var muddled: MutableLiveData<Boolean> = MutableLiveData()
    var poisoned: MutableLiveData<Boolean> = MutableLiveData()
    var strengthend: MutableLiveData<Boolean> = MutableLiveData()
    var stunned: MutableLiveData<Boolean> = MutableLiveData()
    var wounded: MutableLiveData<Boolean> = MutableLiveData()

    init {
        hp.value = stats.hp
        xp.value = stats.xp
        decreasableHp.value = !stats.hasMinHp()
        decreasableXp.value = !stats.hasMinXp()
        increasableHp.value = !stats.hasMaxHp()
        disarmed.value = stats.disarmed.active
        immobilized.value = stats.immobilized.active
        invisible.value = stats.invisible.active
        muddled.value = stats.muddled.active
        poisoned.value = stats.poisoned.active
        strengthend.value = stats.strenghened.active
        stunned.value = stats.stunned.active
        wounded.value = stats.wounded.active
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

    fun toggleDisarm() {
        disarmed.postValue(stats.disarmed.toggle())
    }

    fun toggleImmobilize() {
        immobilized.postValue(stats.immobilized.toggle())
    }

    fun toggleInvisible() {
        invisible.postValue(stats.invisible.toggle())
    }

    fun toggleMuddle() {
        muddled.postValue(stats.muddled.toggle())
    }

    fun togglePoison() {
        poisoned.postValue(stats.poisoned.toggle())
    }

    fun toggleStrengthen() {
        strengthend.postValue(stats.strenghened.toggle())
    }

    fun toggleStun() {
        stunned.postValue(stats.stunned.toggle())
    }

    fun toggleWound() {
        wounded.postValue(stats.wounded.toggle())
    }
}
