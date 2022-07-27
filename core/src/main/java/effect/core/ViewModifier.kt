package effect.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable

@Stable
interface ViewModifier {

    @Composable
    fun Compose(view: ViewWithEffect)

    companion object {

        operator fun invoke(content: @Composable ViewModifierLambda): ViewModifier =
            ViewModifierDefault(content)

    }

}