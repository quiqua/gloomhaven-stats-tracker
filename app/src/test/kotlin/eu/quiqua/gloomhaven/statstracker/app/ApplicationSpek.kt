package eu.quiqua.gloomhaven.statstracker.app

import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.present
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

internal class ApplicationSpek : Spek({
    describe("An application is created") {
        on("create") {
            val application = Application()
            it("provides components via dagger") {
                assert.that(application.applicationComponent, present())
            }
        }
    }
})
