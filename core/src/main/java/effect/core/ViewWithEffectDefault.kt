package effect.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

internal class ViewWithEffectDefault(
    private val content: @Composable ViewWithEffectLambda
) : ViewWithEffect {

    private var modifier: Modifier = Modifier

    override fun append(modifier: Modifier): ViewWithEffect = apply {
        this.modifier = this.modifier.then(modifier)
    }

    override fun prepend(modifier: Modifier): ViewWithEffect = apply {
        this.modifier = modifier.then(this.modifier)
    }

    override fun replace(modifier: Modifier): ViewWithEffect = apply {
        this.modifier = modifier
    }

    @Composable
    override fun Compose() {
        content(modifier)
    }

}