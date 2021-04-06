package hm.binkley.labs

import lombok.Generated

class Foo(private val toggles: List<String>) {
    private val extraCoolToggle = "extraCool"

    fun nifty() =
        if (toggles.contains(extraCoolToggle)) extraCool()
        else defaultCool()

    /** Example of uncovered code. */
    private fun extraCool() = "Apple"

    /** Example of covered code. */
    private fun defaultCool() = "Banana"

    /** Example of dead code ignored by coverage: Be _extra careful_. */
    @Generated
    private fun notCool() = "Crocodile"
}
