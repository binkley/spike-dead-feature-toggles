package hm.binkley.labs

import lombok.Generated
import java.util.Properties

val FEATURE_A = isEnabled("featureA");
val FEATURE_B = isEnabled("featureB");

class Foo {
    private val cool = when {
        FEATURE_A -> coolA()
        FEATURE_B -> coolB()
        else -> throw IllegalArgumentException("Bad feature toggle")
    }

    fun nifty() = cool.nifty()
}

private fun interface Cool {
    fun nifty(): String
}

@Generated
private fun coolA() = Cool { "Apple" }

@Generated
private fun coolB() = Cool { "Banana" }

// TODO: Does stdlib provide help here?
private fun isEnabled(name: String) = Properties().apply {
    load(Foo::class.java.getResourceAsStream("/foo.properties"))
}.getProperty(name).toBoolean()
