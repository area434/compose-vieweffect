package effect.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable

@Stable
interface ViewWithEffect {

    @Composable
    fun Compose()

    companion object {

        operator fun invoke(content: @Composable ViewWithEffectLambda): ViewWithEffect =
            ViewWithEffectDefault(content)

    }

}