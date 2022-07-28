package effect.foundation

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.text.AnnotatedString
import effect.core.ViewScope
import effect.test.ComposeTest
import org.junit.Test

class TextTest : ComposeTest() {

    @Test
    fun drawsText() = compose {
        val expected = "compose-vieweffect"
        setContent { ViewScope { Text(expected) } }
        onNodeWithText(expected).assertExists()
    }

    @Test
    fun drawsAnnotatedText() = compose {
        val expected = AnnotatedString("compose-vieweffect")
        setContent { ViewScope { Text(expected) } }
        onNodeWithText(expected.text).assertExists()
    }

}