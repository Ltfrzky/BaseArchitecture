package com.lutfi.basearchitecture.presentation.base

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/**
 * @author Lutfi Rizky Ramadhan (lutfi.ramadhan@dana.id)
 * @version BaseRecyclerViewAdapter, v 0.1 05/06/2022 22:58 by Lutfi Rizky Ramadhan
 */
abstract class BaseRecyclerViewAdapter<T, V : ViewBinding>(
    val context: Context,
    private var data: MutableList<T>
) : RecyclerView.Adapter<BaseViewHolder<T, V>>() {

    override fun getItemCount(): Int = getDataSize()

    private fun getDataSize() = if (data == null) 0 else data.size

    fun getItem(position: Int): T? {
        return if (position >= 0 && position < getDataSize() && data != null) {
            data[position]
        } else {
            null
        }
    }

    fun removeItemAt(position: Int) {
        if (data.isEmpty() || position < 0) return

        data.removeAt(position)
        notifyItemRemoved(position)
    }

    fun removeItemEquals(item: T) {
        if (data.isEmpty()) return

        data.remove(item)
        notifyDataSetChanged()
    }

    fun removeAllItem() {
        if (data == null || data.isEmpty()) return

        data.clear()
        notifyItemRangeRemoved(0, getDataSize())
    }

    fun appendItems(items: List<T>) {
        if (items.isEmpty()) return

        data.addAll(items)
        notifyDataSetChanged()
    }

    fun appendItem(item: T) {
        if (data != null) {
            data.add(item)
            notifyItemInserted(data.size)
        }
    }

    fun appendItem(position: Int, item: T) {
        if (position < 0) return

        if (data != null) {
            data.add(position, item)
            notifyItemInserted(position)
        }
    }

    fun getItems(): List<T> = data.toList()
}