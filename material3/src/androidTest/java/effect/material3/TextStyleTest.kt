package effect.material3

import androidx.compose.material3.*
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import effect.core.View
import effect.test.ComposeTest
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame
import effect.foundation.LocalTextStyle as EffectTextStyle

class TextStyleTest : ComposeTest() {

    @Test
    fun hasMaterialTextStyle() = compose {
        val expected = TextStyle(color = Color.Magenta)
        var actual: TextStyle? = null
        setContent {
            MaterialTheme(typography = MaterialTheme.typography.copy(displayLarge = expected)) {
                CompositionLocalProvider(LocalTextStyle provides MaterialTheme.typography.displayLarge) {
                    View { actual = EffectTextStyle.current }
                        .materialTextStyle()
                        .Compose()
                }
            }
        }
        assertSame(expected, actual!!)
    }

    @Test
    fun hasMaterialContentColor() = compose {
        val expected = Color.Magenta
        var actual: Color? = null
        setContent {
            MaterialTheme {
                CompositionLocalProvider(LocalContentColor provides expected) {
                    View { actual = EffectTextStyle.current.color }
                        .materialContentColor()
                        .Compose()
                }
            }
        }
        assertEquals(expected, actual)
    }

}