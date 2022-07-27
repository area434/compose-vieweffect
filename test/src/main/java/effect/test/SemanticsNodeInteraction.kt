package effect.test

import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.printToString
import kotlin.test.assertEquals

fun SemanticsNodeInteraction.assertSameAs(expectedNode: SemanticsNodeInteraction) = apply {
    val expected = expectedNode.fetchSemanticsNode()
    val actual = fetchSemanticsNode()
    assertEquals(
        expected.id,
        actual.id,
        "Expected node (${printToString()}) to be equal to (${expectedNode.printToString()})"
    )
}