package effect.core

import androidx.compose.runtime.Composable

internal class ViewModifierDefault(
    private val content: @Composable ViewModifierLambda
) : ViewModifier {

    @Composable
    override fun Compose(view: ViewWithEffect) {
        content(view)
    }

}