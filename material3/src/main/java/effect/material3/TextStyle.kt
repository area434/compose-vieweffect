package effect.material3

import effect.core.View
import effect.foundation.textStyle
import androidx.compose.material3.LocalContentColor as Material3ContentColor
import androidx.compose.material3.LocalTextStyle as Material3TextStyle
import effect.foundation.LocalTextStyle as EffectTextStyle

fun View.materialTextStyle() = textStyle {
    Material3TextStyle.current
}

fun View.materialContentColor() = textStyle {
    EffectTextStyle.current.copy(color = Material3ContentColor.current)
}
