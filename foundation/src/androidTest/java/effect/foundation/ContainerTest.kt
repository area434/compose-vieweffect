package effect.foundation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onParent
import androidx.compose.ui.unit.dp
import effect.core.View
import effect.foundation.ContainerSemantics.AlphaKey
import effect.foundation.ContainerSemantics.BrushKey
import effect.foundation.ContainerSemantics.ClipShapeKey
import effect.foundation.ContainerSemantics.ColorKey
import effect.foundation.ContainerSemantics.ShapeKey
import effect.test.ComposeTest
import org.junit.Test

class ContainerTest : ComposeTest() {

    private val baseTag = "base-tag"
    private val baseView = View { Box(Modifier.testTag(baseTag)) }

    @Test
    fun matchesColor() = compose {
        val expected = Color.Magenta
        setContent { baseView.container(expected, RectangleShape).Compose() }
        onNodeWithTag(baseTag)
            .onParent()
            .assert(matcher = SemanticsMatcher.expectValue(ColorKey, expected))
    }

    @Test
    fun matchesBrush() = compose {
        val expected = SolidColor(Color.Magenta)
        setContent { baseView.container(expected, RectangleShape).Compose() }
        onNodeWithTag(baseTag)
            .onParent()
            .assert(matcher = SemanticsMatcher.expectValue(BrushKey, expected))
    }

    @Test
    fun matchesShape_withColor() = compose {
        val expected = RoundedCornerShape(8.dp)
        setContent { baseView.container(Color.Magenta, expected).Compose() }
        onNodeWithTag(baseTag)
            .onParent()
            .assert(matcher = SemanticsMatcher.expectValue(ShapeKey, expected))
    }

    @Test
    fun matchesShape_withBrush() = compose {
        val expected = RoundedCornerShape(8.dp)
        setContent { baseView.container(SolidColor(Color.Magenta), expected).Compose() }
        onNodeWithTag(baseTag)
            .onParent()
            .assert(matcher = SemanticsMatcher.expectValue(ShapeKey, expected))
    }

    @Test
    fun matchesAlpha() = compose {
        val expected = .3f
        setContent {
            baseView.container(SolidColor(Color.Magenta), RectangleShape, expected).Compose()
        }
        onNodeWithTag(baseTag)
            .onParent()
            .assert(matcher = SemanticsMatcher.expectValue(AlphaKey, expected))
    }

    @Test
    fun matchesClip_withColor() = compose {
        val expected = RoundedCornerShape(8.dp)
        setContent { baseView.container(Color.Magenta, expected).Compose() }
        onNodeWithTag(baseTag)
            .onParent()
            .assert(matcher = SemanticsMatcher.expectValue(ClipShapeKey, expected))
    }

    @Test
    fun matchesClip_withBrush() = compose {
        val expected = RoundedCornerShape(8.dp)
        setContent { baseView.container(SolidColor(Color.Magenta), expected).Compose() }
        onNodeWithTag(baseTag)
            .onParent()
            .assert(matcher = SemanticsMatcher.expectValue(ClipShapeKey, expected))
    }

}