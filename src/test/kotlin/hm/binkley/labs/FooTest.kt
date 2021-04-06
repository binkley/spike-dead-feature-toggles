package hm.binkley.labs

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FooTest {
    @Test
    fun `should use B when toggle A disabled`() {
        val fooWithADisabled = Foo("featureA", emptyList())

        assertEquals("Banana", fooWithADisabled.nifty())
    }
}
