package effect.core

internal class ViewDefault(
    private val content: ViewWithEffect
) : View {

    override fun prepare(): ViewWithEffect {
        return content
    }

}