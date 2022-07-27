package effect.core

import org.junit.Test
import kotlin.test.assertIs

class ViewWithEffectDefaultTest {

    @Test
    fun `invoke returns default instance`() {
        val modifier = ViewWithEffect {}
        assertIs<ViewWithEffectDefault>(modifier)
    }

}