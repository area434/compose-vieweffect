package effect.core

import androidx.compose.runtime.Composable

interface ViewModifier {

    @Composable
    fun Compose(view: ViewWithEffect)

    companion object {

        operator fun invoke(content: @Composable ViewModifierLambda): ViewModifier =
            ViewModifierDefault(content)

    }

}