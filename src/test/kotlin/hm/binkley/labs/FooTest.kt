package hm.binkley.labs

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

private var toggles = System.getProperty("toggles", "extraCool").split(",")

internal class FooTest {
    @Test
    fun `should use extraCool feature`() {
        val fooWithExtraCool = Foo(toggles)

        assertEquals("Apple", fooWithExtraCool.nifty())
    }
}
