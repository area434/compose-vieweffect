package effect.foundation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import effect.core.View
import effect.core.modifier

fun View.container(color: Color, shape: Shape): View = modifier {
    Box(
        modifier = Modifier
            .background(color = color, shape = shape)
            .clip(shape)
    ) {
        it.Compose()
    }
}

fun View.container(brush: Brush, shape: Shape, alpha: Float = 1f): View = modifier {
    Box(
        modifier = Modifier
            .background(brush = brush, shape = shape, alpha = alpha)
            .clip(shape)
    ) {
        it.Compose()
    }
}