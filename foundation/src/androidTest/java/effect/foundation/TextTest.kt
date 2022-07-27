package effect.foundation

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.text.AnnotatedString
import effect.test.ComposeTest
import org.junit.Test

class TextTest : ComposeTest() {

    @Test
    fun drawsText() = compose {
        val expected = "compose-vieweffect"
        setContent { Text(expected).Compose() }
        onNodeWithText(expected).assertExists()
    }

    @Test
    fun drawsAnnotatedText() = compose {
        val expected = AnnotatedString("compose-vieweffect")
        setContent { Text(expected).Compose() }
        onNodeWithText(expected.text).assertExists()
    }

}