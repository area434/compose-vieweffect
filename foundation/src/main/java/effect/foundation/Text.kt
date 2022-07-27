@file:Suppress("FunctionName")

package effect.foundation

import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import effect.core.View

fun Text(
    text: String,
    modifier: Modifier = Modifier,
    onTextLayout: (TextLayoutResult) -> Unit = {}
) = View {
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
    modifier: Modifier = Modifier,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    inlineContent: Map<String, InlineTextContent> = mapOf()
) = View {
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