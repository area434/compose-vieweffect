package effect.core

import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithTag
import effect.test.ComposeTest
import org.junit.Test

class ViewModifierTest : ComposeTest() {

    @Test
    fun writesComposable() = compose {
        val key = "key"
        val modifier = ViewModifier {
            it.Compose()
        }
        setContent { modifier.Compose(view = ViewWithEffect { Box(Modifier.testTag(key)) }) }
        onNodeWithTag(key).assertExists()
    }

    @Test
    fun writesComposableOnce() = compose {
        val key = "key"
        val modifier = ViewModifier {
            it.Compose()
        }
        setContent { modifier.Compose(view = ViewWithEffect { Box(Modifier.testTag(key)) }) }
        onAllNodesWithTag(key).assertCountEquals(1)
    }

    @Test
    fun writesNothing() = compose {
        val key = "key"
        val modifier = ViewModifier {
            // intentionally empty
        }
        setContent { modifier.Compose(view = ViewWithEffect { Box(Modifier.testTag(key)) }) }
        onNodeWithTag(key).assertDoesNotExist()
    }

}