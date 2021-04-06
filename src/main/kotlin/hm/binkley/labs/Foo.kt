package hm.binkley.labs

import java.util.Properties

class Foo(featureA: String) {
    private val cool =
        if (isEnabled(featureA)) coolA()
        else coolB()

    fun nifty() = cool.nifty()
}

private fun interface Cool {
    fun nifty(): String
}

private fun coolA() = Cool { "Apple" }

private fun coolB() = Cool { "Banana" }

private fun isEnabled(toggle: String) = Properties().apply {
    load(Foo::class.java.getResourceAsStream("/foo.properties"))
}.getProperty(toggle).toBoolean()
