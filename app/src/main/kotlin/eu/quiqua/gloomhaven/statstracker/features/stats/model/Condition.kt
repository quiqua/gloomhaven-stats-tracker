package eu.quiqua.gloomhaven.statstracker.features.stats.model

sealed class Condition() {
    class Disarm : Condition()
    class Immobilize : Condition()
    class Invisible : Condition()
    class Muddle : Condition()
    class Poison : Condition()
    class Strengthen : Condition()
    class Stun : Condition()
    class Wound : Condition()

    var active: Boolean = false

    fun toggle(): Boolean {
        active = active.not()
        return active
    }
}
