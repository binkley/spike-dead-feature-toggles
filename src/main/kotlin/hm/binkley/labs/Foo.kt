package hm.binkley.labs

class Foo(featureA: String) {
    private val cool = when (featureA) {
        "A" -> coolA()
        else -> coolB()
    }

    fun nifty() = cool.nifty()
}

private fun interface Cool {
    fun nifty(): String
}

private fun coolA() = Cool { "Apple" }

private fun coolB() = Cool { "Banana" }
