package effect.foundation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import effect.core.View
import effect.test.ComposeTest
import org.junit.Test
import kotlin.random.Random.Default.nextBoolean
import kotlin.random.Random.Default.nextInt

class TextStyleTest : ComposeTest() {

    @Test
    fun contains_textStyle() = compose {
        val expected = TextStyle(color = Color.Magenta)
        setContent {
            View { Box(modifier = it.testTag(LocalTextStyle.current.toString())) }
                .textStyle(expected)
                .Compose()
        }
        onNodeWithTag(expected.toString()).assertExists()
    }

    @Test
    fun contains_maxLines() = compose {
        val expected = nextInt()
        setContent {
            View { Box(modifier = it.testTag(LocalMaxLines.current.toString())) }
                .maxLines(expected)
                .Compose()
        }
        onNodeWithTag(expected.toString()).assertExists()
    }

    @Test
    fun contains_softWrap() = compose {
        val expected = nextBoolean()
        setContent {
            View { Box(modifier = it.testTag(LocalSoftWrap.current.toString())) }
                .softWrap(expected)
                .Compose()
        }
        onNodeWithTag(expected.toString()).assertExists()
    }

    @Test
    fun contains_textOverflow() = compose {
        val expected =
            listOf(TextOverflow.Clip, TextOverflow.Ellipsis, TextOverflow.Visible).random()
        setContent {
            View { Box(modifier = it.testTag(LocalTextOverflow.current.toString())) }
                .textOverflow(expected)
                .Compose()
        }
        onNodeWithTag(expected.toString()).assertExists()
    }

    @Test
    fun contains_enabled() = compose {
        val expected = nextBoolean()
        setContent {
            View { Box(modifier = it.testTag(LocalEnabled.current.toString())) }
                .enabled(expected)
                .Compose()
        }
        onNodeWithTag(expected.toString()).assertExists()
    }

    @Test
    fun contains_readOnly() = compose {
        val expected = nextBoolean()
        setContent {
            View { Box(modifier = it.testTag(LocalReadOnly.current.toString())) }
                .readOnly(expected)
                .Compose()
        }
        onNodeWithTag(expected.toString()).assertExists()
    }

    @Test
    fun contains_keyboardOptions() = compose {
        val expected = KeyboardOptions(autoCorrect = nextBoolean())
        setContent {
            View { Box(modifier = it.testTag(LocalKeyboardOptions.current.toString())) }
                .keyboardOptions(expected)
                .Compose()
        }
        onNodeWithTag(expected.toString()).assertExists()
    }

    @Test
    fun contains_keyboardActions() = compose {
        val expected = KeyboardActions(onDone = {})
        setContent {
            View { Box(modifier = it.testTag(LocalKeyboardActions.current.toString())) }
                .keyboardActions(expected)
                .Compose()
        }
    }

    @Test
    fun contains_visualTransformation() = compose {
        val expected =
            VisualTransformation { TransformedText(AnnotatedString(""), OffsetMapping.Identity) }
        setContent {
            View { Box(modifier = it.testTag(LocalVisualTransformation.current.toString())) }
                .visualTransformation(expected)
                .Compose()
        }
        onNodeWithTag(expected.toString()).assertExists()
    }

    @Test
    fun contains_cursorBrush() = compose {
        val expected = SolidColor(listOf(Color.Magenta, Color.Gray).random())
        setContent {
            View { Box(modifier = it.testTag(LocalCursorBrush.current.toString())) }
                .cursorBrush(expected)
                .Compose()
        }
        onNodeWithTag(expected.toString()).assertExists()
    }

}
