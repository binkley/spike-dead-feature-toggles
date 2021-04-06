package hm.binkley.labs

class Foo(featureA: String, toggles: List<String>) {
    private val cool =
        if (toggles.contains(featureA)) coolA()
        else coolB()

    fun nifty() = cool.nifty()
}

private fun interface Cool {
    fun nifty(): String
}

private fun coolA() = Cool { "Apple" }

private fun coolB() = Cool { "Banana" }
