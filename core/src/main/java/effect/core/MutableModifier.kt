package effect.core

import androidx.compose.ui.Modifier

interface MutableModifier<T> {

    fun append(modifier: Modifier): T
    fun prepend(modifier: Modifier): T
    fun replace(modifier: Modifier): T

}