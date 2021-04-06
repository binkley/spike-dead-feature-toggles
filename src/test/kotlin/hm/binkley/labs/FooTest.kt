package hm.binkley.labs

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

private var toggles = System.getProperty("toggles", "").split(",")

internal class FooTest {
    @Test
    fun `should not use disabled feature toggle`() {
        val fooWithExtraCool = Foo(toggles)

        assertEquals("Banana", fooWithExtraCool.nifty())
    }
}
