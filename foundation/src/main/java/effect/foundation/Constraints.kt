package effect.foundation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import effect.core.View

fun View.padding(
    padding: PaddingValues
) = append(Modifier.padding(paddingValues = padding))

fun View.padding(
    horizontal: Dp,
    vertical: Dp
) = padding(padding = PaddingValues(horizontal, vertical))

fun View.padding(
    start: Dp,
    top: Dp,
    end: Dp,
    bottom: Dp
) = padding(padding = PaddingValues(start, top, end, bottom))

fun View.padding(
    all: Dp
) = padding(PaddingValues(all))

fun View.padding() = padding(16.dp, 8.dp)