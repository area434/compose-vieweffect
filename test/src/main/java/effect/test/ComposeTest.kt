package effect.test

import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule

abstract class ComposeTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    protected fun compose(test: ComposeContentTestRule.() -> Unit) {
        composeTestRule.test()
    }

}