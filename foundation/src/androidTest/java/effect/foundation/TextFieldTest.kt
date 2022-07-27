package effect.foundation

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.text.input.TextFieldValue
import effect.test.ComposeTest
import org.junit.Test

class TextFieldTest : ComposeTest() {

    @Test
    fun drawsText() = compose {
        val expected = "compose-vieweffect"
        setContent { TextField(expected, {}).Compose() }
        onNodeWithText(expected).assertExists()
    }

    @Test
    fun drawsAnnotatedText() = compose {
        val expected = TextFieldValue("compose-vieweffect")
        setContent { TextField(expected, {}).Compose() }
        onNodeWithText(expected.text).assertExists()
    }

}