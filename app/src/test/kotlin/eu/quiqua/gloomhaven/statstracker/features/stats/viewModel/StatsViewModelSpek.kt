package eu.quiqua.gloomhaven.statstracker.features.stats.viewModel

import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.present
import eu.quiqua.gloomhaven.statstracker.features.stats.model.Stats
import io.mockk.mockk
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

internal class StatsViewModelSpek : Spek({
    given("a StatsViewModel") {
        val stats = mockk<Stats>()
        val statsViewModel = StatsViewModel(stats)
        on("getStats") {
            it("should return the defined model with its stats") {
                assert.that(statsViewModel.stats, present())
            }
        }
    }
})
