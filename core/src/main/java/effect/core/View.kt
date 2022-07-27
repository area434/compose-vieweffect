package effect.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable

@Stable
interface View {

    fun prepare(): ViewWithEffect

    @Composable
    fun Compose() {
        prepare().Compose()
    }

    companion object {

        operator fun invoke(content: ViewWithEffect): View {
            return ViewImpl(content)
        }

        operator fun invoke(content: @Composable ViewWithEffectLambda): View {
            return ViewImpl(ViewWithEffect(content))
        }

    }

}