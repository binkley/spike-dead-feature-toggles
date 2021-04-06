package hm.binkley.labs

private const val extraCoolToggle = "featureA"

class Foo(toggles: List<String>) {
    private val cool =
        if (toggles.contains(extraCoolToggle)) extraCool()
        else defaultCool()

    fun nifty() = cool.nifty()
}

private fun interface Cool {
    fun nifty(): String
}

private fun extraCool() = Cool { "Apple" }

private fun defaultCool() = Cool { "Banana" }
