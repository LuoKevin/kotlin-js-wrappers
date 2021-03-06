package antd.transfer

import react.*

external class TransferListItemComponent<RecordType> : Component<ListItemProps<RecordType>, RState> {
    override fun render(): ReactElement?
}

external interface ListItemProps<RecordType> : RProps {
    var renderedText: Any? /* String | Number */
    var renderedEl: Any /* String | ReactElement */
    var disabled: Boolean?
    var checked: Boolean?
    var prefixCls: String
    var onClick: ((item: RecordType) -> Unit)?
    var onRemove: ((item: RecordType) -> Unit)?
    var item: RecordType
    var showRemove: Boolean?
}
