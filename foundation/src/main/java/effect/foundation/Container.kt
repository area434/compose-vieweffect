package effect.foundation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.semantics.semantics
import effect.core.View
import effect.core.modifier

fun View.container(color: Color, shape: Shape): View = modifier {
    Box(
        modifier = Modifier
            .background(color = color, shape = shape)
            .clip(shape)
            .semantics {
                set(ContainerSemantics.ColorKey, color)
                set(ContainerSemantics.ShapeKey, shape)
                set(ContainerSemantics.ClipShapeKey, shape)
            }
    ) {
        it.Compose()
    }
}

fun View.container(brush: Brush, shape: Shape, alpha: Float = 1f): View = modifier {
    Box(
        modifier = Modifier
            .background(brush = brush, shape = shape, alpha = alpha)
            .clip(shape)
            .semantics {
                set(ContainerSemantics.BrushKey, brush)
                set(ContainerSemantics.ShapeKey, shape)
                set(ContainerSemantics.AlphaKey, alpha)
                set(ContainerSemantics.ClipShapeKey, shape)
            }
    ) {
        it.Compose()
    }
}

// ---

object ContainerSemantics {

    val ColorKey = SemanticsPropertyKey<Color>("Color")
    val BrushKey = SemanticsPropertyKey<Brush>("Brush")
    val ShapeKey = SemanticsPropertyKey<Shape>("Shape")
    val AlphaKey = SemanticsPropertyKey<Float>("Alpha")
    val ClipShapeKey = SemanticsPropertyKey<Shape>("Clip")

}
