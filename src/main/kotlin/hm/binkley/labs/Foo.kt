package hm.binkley.labs

import hm.binkley.labs.Foo.Cool
import java.util.Properties

val FEATURE_A = isEnabled("featureA");
val FEATURE_B = isEnabled("featureB");

class Foo {
    fun interface Cool {
        fun nifty(): String
    }

    private val cool = when {
        FEATURE_A -> Cool { "Apple" }
        FEATURE_B -> Cool { "Banana" }
        else -> throw IllegalArgumentException("Bad feature toggle")
    }

    fun nifty() = cool.nifty()
}

// TODO: Does stdlib provide help here?
private fun isEnabled(name: String) = Properties().apply {
    load(Foo::class.java.getResourceAsStream("/foo.properties"))
}.getProperty(name).toBoolean()
