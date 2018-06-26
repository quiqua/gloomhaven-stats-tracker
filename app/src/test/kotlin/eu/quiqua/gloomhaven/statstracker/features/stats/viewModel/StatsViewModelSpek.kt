package eu.quiqua.gloomhaven.statstracker.features.stats.viewModel

import android.arch.core.executor.ArchTaskExecutor
import android.arch.core.executor.TaskExecutor
import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.present
import eu.quiqua.gloomhaven.statstracker.features.stats.model.Stats
import io.mockk.every
import io.mockk.mockk
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

internal class StatsViewModelSpek : Spek({
    describe("a statsViewModel") {
        // In order to test LiveData, the `InstantTaskExecutorRule` rule needs to be applied via JUnit.
        // As we are running it with Spek, the "rule" will be implemented in this way instead
        beforeEachTest {
            // Junit Rule to apply
            ArchTaskExecutor.getInstance().setDelegate(object : TaskExecutor() {
                override fun executeOnDiskIO(runnable: Runnable) {
                    runnable.run()
                }

                override fun isMainThread(): Boolean {
                    return true
                }

                override fun postToMainThread(runnable: Runnable) {
                    runnable.run()
                }
            })
        }

        on("creation") {
            val stats = mockk<Stats>()
            every { stats.hp } returns 6
            every { stats.xp } returns 0
            every { stats.hasMinHp() } returns false
            every { stats.hasMinXp() } returns true
            every { stats.hasMaxHp() } returns true

            it("should initialize without problems") {
                assert.that(StatsViewModel(stats), present())
            }
        }

        afterEachTest { ArchTaskExecutor.getInstance().setDelegate(null) }
    }
})
