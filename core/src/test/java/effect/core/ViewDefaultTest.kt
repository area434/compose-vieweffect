package effect.core

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class ViewDefaultTest {

    @Test
    fun `prepare returns content`() {
        val content = ViewWithEffect {}
        val view = ViewDefault(content)
        assertEquals(content, view.prepare())
    }

    @Test
    fun `invoke with lambda creates new view instance`() {
        val view = View {}
        assertIs<ViewDefault>(view)
    }

    @Test
    fun `invoke with instance creates new view instance`() {
        val effect = ViewWithEffect {}
        val view = View(effect)
        assertIs<ViewDefault>(view)
    }

}
