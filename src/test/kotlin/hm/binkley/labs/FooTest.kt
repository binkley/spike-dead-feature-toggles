package hm.binkley.labs

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

private var toggles = System.getProperty("toggles", "").split(",")

internal class FooTest {
    @Test
    fun `should use B when toggle A disabled`() {
        val fooWithADisabled = Foo(toggles)

        assertEquals("Banana", fooWithADisabled.nifty())
    }
}
