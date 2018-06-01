package eu.quiqua.gloomhaven.statstracker

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions.assertEquals

object CalculatorSpec: Spek({
    given("a calculator") {
        val calculator = "hello"
        on("addition") {
            val sum = calculator + "world"
            it("should return the result of adding the first number to the second number") {
                assertEquals(6, sum)
            }
        }
    }
})