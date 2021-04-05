package hm.binkley.labs.hm.binkley.labs

import hm.binkley.labs.FEATURE_A
import hm.binkley.labs.FEATURE_B
import hm.binkley.labs.FEATURE_C
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class FooTest {
    @Test
    fun `should have feature A`() {
        assertTrue(FEATURE_A)
    }

    @Test
    fun `should not have feature B`() {
        assertFalse(FEATURE_B)
    }

    @Test
    fun `should not have feature C`() {
        assertFalse(FEATURE_C)
    }
}
