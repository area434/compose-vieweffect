package effect.foundation

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import effect.core.View
import effect.core.modifier

val LocalTextStyle = staticCompositionLocalOf { TextStyle.Default }

fun View.textStyle(style: TextStyle) = modifier {
    CompositionLocalProvider(LocalTextStyle provides style) {
        it.Compose()
    }
}

fun View.textStyle(style: @Composable () -> TextStyle) = modifier {
    CompositionLocalProvider(LocalTextStyle provides style()) {
        it.Compose()
    }
}

val LocalMaxLines = staticCompositionLocalOf { Int.MAX_VALUE }

fun View.maxLines(lines: Int) = modifier {
    CompositionLocalProvider(LocalMaxLines provides lines) {
        it.Compose()
    }
}

val LocalSoftWrap = staticCompositionLocalOf { true }

fun View.softWrap(softWrap: Boolean) = modifier {
    CompositionLocalProvider(LocalSoftWrap provides softWrap) {
        it.Compose()
    }
}

val LocalTextOverflow = staticCompositionLocalOf { TextOverflow.Clip }

fun View.textOverflow(textOverflow: TextOverflow) = modifier {
    CompositionLocalProvider(LocalTextOverflow provides textOverflow) {
        it.Compose()
    }
}

val LocalEnabled = staticCompositionLocalOf { true }

fun View.enabled(enabled: Boolean) = modifier {
    CompositionLocalProvider(LocalEnabled provides enabled) {
        it.Compose()
    }
}

val LocalReadOnly = staticCompositionLocalOf { false }

fun View.readOnly(readOnly: Boolean) = modifier {
    CompositionLocalProvider(LocalReadOnly provides readOnly) {
        it.Compose()
    }
}

val LocalKeyboardOptions = staticCompositionLocalOf { KeyboardOptions.Default }

fun View.keyboardOptions(options: KeyboardOptions) = modifier {
    CompositionLocalProvider(LocalKeyboardOptions provides options) {
        it.Compose()
    }
}

val LocalKeyboardActions = staticCompositionLocalOf { KeyboardActions.Default }

fun View.keyboardActions(actions: KeyboardActions) = modifier {
    CompositionLocalProvider(LocalKeyboardActions provides actions) {
        it.Compose()
    }
}

val LocalVisualTransformation = staticCompositionLocalOf { VisualTransformation.None }

fun View.visualTransformation(transformation: VisualTransformation) = modifier {
    CompositionLocalProvider(LocalVisualTransformation provides transformation) {
        it.Compose()
    }
}

val LocalCursorBrush = staticCompositionLocalOf<Brush> { SolidColor(Color.Black) }

fun View.cursorBrush(brush: Brush) = modifier {
    CompositionLocalProvider(LocalCursorBrush provides brush) {
        it.Compose()
    }
}