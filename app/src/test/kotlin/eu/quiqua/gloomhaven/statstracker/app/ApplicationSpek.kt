package eu.quiqua.gloomhaven.statstracker.app

import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.present
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.subject.SubjectSpek

internal class ApplicationSpek : SubjectSpek<Application>({
    subject { Application() }

    describe("an application") {
        beforeEachTest { subject.inject() }

        it("provides components via dagger") {
            assert.that(subject.activityInjector(), present())
        }
    }
})
