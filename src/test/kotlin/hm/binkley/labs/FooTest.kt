package hm.binkley.labs.hm.binkley.labs

import hm.binkley.labs.Foo
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FooTest {
    @Test
    fun `should have feature A`() {
        assertEquals("Apple", Foo("featureA").nifty())
    }
}
