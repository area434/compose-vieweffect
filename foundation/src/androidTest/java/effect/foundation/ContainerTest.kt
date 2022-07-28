package effect.foundation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import effect.core.View
import effect.core.ViewScope
import effect.test.ComposeTest
import org.junit.Test

class ContainerTest : ComposeTest() {

    @Test
    fun matchesColor() = compose {
        val expected = Color.Magenta
        setContent {
            View { it.assertContainsProperty(name = "color", value = expected) }
                .container(expected, RectangleShape)
                .Compose()
        }
    }

    @Test
    fun matchesBrush() = compose {
        val expected = SolidColor(Color.Magenta)
        setContent {
            ViewScope {
                View { it.assertContainsProperty("brush", expected) }
                    .container(expected, RectangleShape)
            }
        }
    }

    @Test
    fun matchesShape_withColor() = compose {
        val expected = RoundedCornerShape(8.dp)
        setContent {
            ViewScope {
                View { it.assertContainsProperty("shape", expected) }
                    .container(Color.Magenta, expected)
            }
        }
    }

    @Test
    fun matchesShape_withBrush() = compose {
        val expected = RoundedCornerShape(8.dp)
        setContent {
            ViewScope {
                View { it.assertContainsProperty("shape", expected) }
                    .container(SolidColor(Color.Magenta), expected)
            }
        }
    }

    @Test
    fun matchesAlpha() = compose {
        val expected = .3f
        setContent {
            ViewScope {
                View { it.assertContainsProperty("alpha", expected, separator = " = ") }
                    .container(SolidColor(Color.Magenta), RectangleShape, expected)
            }
        }
    }

    @Test
    fun matchesClip_withColor() = compose {
        val expected = RoundedCornerShape(8.dp)
        setContent {
            ViewScope {
                View {
                    it.assertContainsProperty("clip", true)
                    it.assertContainsProperty("shape", expected)
                }.container(Color.Magenta, expected)
            }
        }
    }

    @Test
    fun matchesClip_withBrush() = compose {
        val expected = RoundedCornerShape(8.dp)
        setContent {
            ViewScope {
                View {
                    it.assertContainsProperty("clip", true)
                    it.assertContainsProperty("shape", expected)
                }.container(SolidColor(Color.Magenta), expected)
            }
        }
    }

// ---

    private fun Modifier.assertContainsProperty(name: String, value: Any, separator: String = "=") {
        val hasColor = any { it.toString().contains("$name$separator$value") }
        assert(hasColor) {
            "No modifiers contain property '$name' of '$value' in $this"
        }
    }

}