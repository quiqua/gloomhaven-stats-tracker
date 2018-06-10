package eu.quiqua.gloomhaven.statstracker.features.stats.model

import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

internal class StatsSpek : Spek({
    describe("a stats model object") {
        on("initialization with default values") {
            it("should return default hp value") {
                val stats = Stats()
                assert.that(stats.hp, equalTo(0))
            }

            it("should return default xp value") {
                val stats = Stats()
                assert.that(stats.hp, equalTo(0))
            }
        }

        on("increasing hp") {
            val stats = Stats(hp = 0)

            it("should increase the value by one") {
                stats.increaseHp()
                assert.that(stats.hp, equalTo(1))
            }
        }

        on("increasing xp") {
            val stats = Stats(xp = 0)

            it("should increase the value by one") {
                stats.increaseXp()
                assert.that(stats.xp, equalTo(1))
            }
        }

        on("decreasing hp") {
            val stats = Stats(hp = 1)

            it("should decrease the value by one") {
                stats.decreaseHp()
                assert.that(stats.hp, equalTo(0))
            }
        }

        on("decreasing xp") {
            val stats = Stats(xp = 1)

            it("should decrease the value by one") {
                stats.decreaseXp()
                assert.that(stats.xp, equalTo(0))
            }
        }
    }
})
