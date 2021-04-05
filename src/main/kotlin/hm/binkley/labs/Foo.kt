package hm.binkley.labs

import java.util.Properties

val FEATURE_A = isEnabled("featureA");
val FEATURE_B = isEnabled("featureB");
val FEATURE_C = isEnabled("featureC");

class Foo

// TODO: Does stdlib provide help here?
private fun isEnabled(name: String) = Properties().apply {
    load(Foo::class.java.getResourceAsStream("/foo.properties"))
}.getProperty(name).toBoolean()
