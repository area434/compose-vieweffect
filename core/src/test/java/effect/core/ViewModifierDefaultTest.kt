package effect.core

import org.junit.Test
import kotlin.test.assertIs

class ViewModifierDefaultTest {

    @Test
    fun `invoke returns default instance`() {
        val modifier = ViewModifier {}
        assertIs<ViewModifierDefault>(modifier)
    }

}