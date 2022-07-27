package effect.core

internal class ViewImpl(
    private val content: ViewWithEffect
) : View {

    override fun prepare(): ViewWithEffect {
        return content
    }

}