package effect.core

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onParent
import effect.test.ComposeTest
import effect.test.assertSameAs
import org.junit.Test

class ViewTest : ComposeTest() {

    private val baseTag = "base-key"
    private val baseView = View { Box(modifier = Modifier.testTag(baseTag)) }

    @Test
    fun modifierWrapsWithWidget() = compose {
        val outerTag = "outer-tag"
        val view = baseView.modifier {
            Box(
                modifier = Modifier
                    .background(Color.Black)
                    .testTag(outerTag)
            ) {
                it.Compose()
            }
        }
        setContent { view.Compose() }
        val outer = onNodeWithTag(outerTag).assertExists()
        val inner = onNodeWithTag(baseTag).assertExists()
        inner.onParent().assertSameAs(outer)
    }

    @Test
    fun composesView() = compose {
        setContent { baseView.Compose() }
        onNodeWithTag(baseTag).assertExists()
    }


}