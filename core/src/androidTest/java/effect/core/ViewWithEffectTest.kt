package effect.core

import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithTag
import effect.test.ComposeTest
import org.junit.Test

class ViewWithEffectTest : ComposeTest() {

    @Test
    fun writesComposable() = compose {
        val key = "key"
        val effect = ViewWithEffect {
            Box(modifier = Modifier.testTag(key))
        }
        setContent { effect.Compose() }
        onNodeWithTag(key).assertExists()
    }

    @Test
    fun writesExactlyOnce() = compose {
        val key = "key"
        val effect = ViewWithEffect {
            Box(modifier = Modifier.testTag(key))
        }
        setContent { effect.Compose() }
        onAllNodesWithTag(key).assertCountEquals(1)
    }

}