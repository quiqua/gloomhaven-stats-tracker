package eu.quiqua.gloomhaven.statstracker.features.stats.model

class Stats(var hp: Int = 0, var xp: Int = 0) {
    fun increaseHp(): Int {
        hp += 1
        return hp
    }

    fun decreaseHp(): Int {
        hp -= 1
        return hp
    }

    fun increaseXp(): Int {
        xp += 1
        return xp
    }

    fun decreaseXp(): Int {
        xp -= 1
        return xp
    }
}
