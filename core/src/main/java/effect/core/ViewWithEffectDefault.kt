package effect.core

import androidx.compose.runtime.Composable

internal class ViewWithEffectDefault(
    private val content: @Composable ViewWithEffectLambda
) : ViewWithEffect {

    @Composable
    override fun Compose() {
        content()
    }

}