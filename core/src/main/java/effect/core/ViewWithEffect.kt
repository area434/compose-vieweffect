package effect.core

import androidx.compose.runtime.Composable

interface ViewWithEffect : MutableModifier<ViewWithEffect> {

    @Composable
    fun Compose()

    companion object {

        operator fun invoke(content: @Composable ViewWithEffectLambda): ViewWithEffect =
            ViewWithEffectDefault(content)

    }

}