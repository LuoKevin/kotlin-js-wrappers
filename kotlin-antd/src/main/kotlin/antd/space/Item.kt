package antd.space

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object ItemComponent : Component<ItemProps, RState> {
    override fun render(): ReactElement?
}

external interface ItemProps : RProps {
    var className: String
    var children: Any /* String | ReactElement */
    var index: Number
    var direction: String? /* "horizontal" | "vertical" */
    var size: Any? /* SizeType | Number */
    var marginDirection: String /* "marginLeft" | "marginRight" */
    var split: Any? /* String | ReactElement */
}
