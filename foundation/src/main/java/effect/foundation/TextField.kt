@file:Suppress("FunctionName")

package effect.foundation

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.input.TextFieldValue
import effect.core.View

fun TextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource = MutableInteractionSource()
) = View {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = LocalEnabled.current,
        readOnly = LocalReadOnly.current,
        textStyle = LocalTextStyle.current,
        keyboardOptions = LocalKeyboardOptions.current,
        keyboardActions = LocalKeyboardActions.current,
        singleLine = LocalMaxLines.current <= 1,
        maxLines = LocalMaxLines.current,
        visualTransformation = LocalVisualTransformation.current,
        onTextLayout = onTextLayout,
        interactionSource = remember { interactionSource },
        cursorBrush = LocalCursorBrush.current
    )
}

fun TextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource = MutableInteractionSource()
) = View {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = LocalEnabled.current,
        readOnly = LocalReadOnly.current,
        textStyle = LocalTextStyle.current,
        keyboardOptions = LocalKeyboardOptions.current,
        keyboardActions = LocalKeyboardActions.current,
        singleLine = LocalMaxLines.current <= 1,
        maxLines = LocalMaxLines.current,
        visualTransformation = LocalVisualTransformation.current,
        onTextLayout = onTextLayout,
        interactionSource = remember { interactionSource },
        cursorBrush = LocalCursorBrush.current
    )
}