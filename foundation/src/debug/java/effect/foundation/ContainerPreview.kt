package effect.foundation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import effect.core.View

@Preview(showBackground = true)
@Composable
private fun Preview() {
    View { Box(it.size(48.dp)) }
        .container(Color.Magenta, RoundedCornerShape(16.dp))
        .Compose()
}