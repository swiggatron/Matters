package com.jjswigut.matters.util

import androidx.annotation.Nullable
import androidx.recyclerview.widget.DiffUtil
import com.jjswigut.matters.database.Matter

class ListDiffCallback(
    private val oldList: List<Matter>,
    private val newList: List<Matter>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].matterTitle === newList[newItemPosition].matterTitle
    }

    override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        return oldList[oldPosition].matterTitle == newList[newPosition].matterTitle
    }

    @Nullable
    override fun getChangePayload(oldPosition: Int, newPosition: Int): Any? {
        return super.getChangePayload(oldPosition, newPosition)
    }
}