package eu.quiqua.gloomhaven.statstracker.features.stats.model

sealed class Condition(var active: Boolean = false) {

    class Disarm : Condition()
    class Immobilize : Condition()
    class Invisible : Condition()
    class Muddle : Condition()
    class Poison : Condition()
    class Strengthen : Condition()
    class Stun : Condition()
    class Wound : Condition()

    fun toggle(): Boolean {
        active = active.not()
        return active
    }

    fun isActive(): Boolean {
        return active
    }

    fun isInactive(): Boolean {
        return active.not()
    }
}
