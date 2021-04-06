package hm.binkley.labs.hm.binkley.labs

import hm.binkley.labs.Foo
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

internal class FooTest {
    private val foo = Foo()

    @Test
    fun `should have feature A`() {
        assertEquals("Apple", foo.nifty())
    }

    @Test
    fun `should not have feature B`() {
        assertNotEquals("Banana", foo.nifty())
    }
}
