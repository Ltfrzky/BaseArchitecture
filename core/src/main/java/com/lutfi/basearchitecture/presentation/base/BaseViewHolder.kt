package com.lutfi.basearchitecture.presentation.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/**
 * @author Lutfi Rizky Ramadhan (lutfirizkyramadhan@gmail.com)
 * @version BaseViewHolder, v 0.1 05/06/2022 22:57 by Lutfi Rizky Ramadhan
 */
abstract class BaseViewHolder<T, V : ViewBinding>(view: V) : RecyclerView.ViewHolder(view.root) {

    abstract fun bind(data: T)

    val binding: V = view

}