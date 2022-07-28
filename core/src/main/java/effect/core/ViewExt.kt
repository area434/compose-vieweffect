package effect.core

import androidx.compose.runtime.Composable

fun View.modifier(content: ViewModifier): View {
    return View { content.Compose(view = prepare()) }
}

fun View.modifier(content: @Composable ViewModifierLambda): View {
    return View { content(prepare()) }
}

@Composable
inline fun ViewScope(content: @Composable () -> View) {
    content().Compose()
}