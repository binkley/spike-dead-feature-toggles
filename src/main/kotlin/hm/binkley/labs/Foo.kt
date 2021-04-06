package hm.binkley.labs

class Foo(featureA: String) {
    private val cool = when (featureA) {
        "A" -> coolA()
        else -> coolB()
    }

    fun nifty() = cool.nifty()
}

fun interface Cool {
    fun nifty(): String
}

fun coolA() = Cool { "Apple" }

fun coolB() = Cool { "Banana" }
