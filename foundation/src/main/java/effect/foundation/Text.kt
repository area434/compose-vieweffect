@file:Suppress("FunctionName")

package effect.foundation

import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import effect.core.View

fun Text(
    text: String,
    onTextLayout: (TextLayoutResult) -> Unit = {}
) = View { modifier ->
    BasicText(
        text = text,
        modifier = modifier,
        style = LocalTextStyle.current,
        onTextLayout = onTextLayout,
        overflow = LocalTextOverflow.current,
        softWrap = LocalSoftWrap.current,
        maxLines = LocalMaxLines.current
    )
}

fun Text(
    text: AnnotatedString,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    inlineContent: Map<String, InlineTextContent> = mapOf()
) = View { modifier ->
    BasicText(
        text = text,
        modifier = modifier,
        style = LocalTextStyle.current,
        onTextLayout = onTextLayout,
        overflow = LocalTextOverflow.current,
        softWrap = LocalSoftWrap.current,
        maxLines = LocalMaxLines.current,
        inlineContent = inlineContent
    )
}