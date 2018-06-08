package eu.quiqua.gloomhaven.statstracker.features.stats.viewModel

import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.present
import eu.quiqua.gloomhaven.statstracker.app.Application
import eu.quiqua.gloomhaven.statstracker.features.stats.viewmodel.StatsViewModel
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

internal class StatsViewModelSpek : Spek({
    given("an application") {
        val application = Application()
        given("with a StatsViewModel") {
            val statsViewModel = StatsViewModel(application)
            on("getStats") {
                it("should return the defined model with its stats") {
                    assert.that(statsViewModel.stats, present())
                }
            }
        }
    }
})
