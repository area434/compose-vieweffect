package effect.core

import androidx.compose.ui.Modifier

internal class ViewDefault(
    private val content: ViewWithEffect
) : View {

    override fun prepare(): ViewWithEffect {
        return content
    }

    override fun append(modifier: Modifier): View = apply {
        content.append(modifier)
    }

    override fun prepend(modifier: Modifier): View = apply {
        content.prepend(modifier)
    }

    override fun replace(modifier: Modifier): View = apply {
        content.replace(modifier)
    }

}