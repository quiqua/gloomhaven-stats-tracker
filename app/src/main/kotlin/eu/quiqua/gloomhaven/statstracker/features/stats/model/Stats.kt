package eu.quiqua.gloomhaven.statstracker.features.stats.model

class Stats(
    var hp: Int = 0,
    var xp: Int = 0,
    val disarmed: Condition.Disarm = Condition.Disarm(),
    val immobilized: Condition.Immobilize = Condition.Immobilize(),
    val invisible: Condition.Invisible = Condition.Invisible(),
    val muddled: Condition.Muddle = Condition.Muddle(),
    val poisoned: Condition.Poison = Condition.Poison(),
    val strenghened: Condition.Strengthen = Condition.Strengthen(),
    val stunned: Condition.Stun = Condition.Stun(),
    val wounded: Condition.Wound = Condition.Wound()
) {

    companion object {
        private const val MAX_HP = 26
        private const val MIN_HP = 0
        private const val MIN_XP = 0
    }

    fun increaseHp(): Int {
        if (hp < MAX_HP) {
            hp += 1
        }
        return hp
    }

    fun decreaseHp(): Int {
        if (hp > MIN_HP) {
            hp -= 1
        }
        return hp
    }

    fun increaseXp(): Int {
        xp += 1
        return xp
    }

    fun decreaseXp(): Int {
        if (xp > MIN_XP) {
            xp -= 1
        }
        return xp
    }

    fun hasMaxHp(): Boolean = hp == MAX_HP

    fun hasMinHp(): Boolean = hp == MIN_HP

    fun hasMinXp(): Boolean = xp == MIN_XP
}
