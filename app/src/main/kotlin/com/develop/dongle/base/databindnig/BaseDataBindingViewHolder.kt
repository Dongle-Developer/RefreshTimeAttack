package com.develop.dongle.base.databindnig

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseDataBindingViewHolder<ITEM>(
    private val view: View,
    private var click: (() -> Unit)? = null,
    private var positonClick: ((position: Int) -> Unit)? = null
) : RecyclerView.ViewHolder(view) {

    protected val binding: ViewDataBinding? = DataBindingUtil.bind(view)

    @Throws(Exception::class)
    abstract fun bindDataAndPositon(data: ITEM, position: Int)

    @Throws(Exception::class)
    abstract fun bindData(data: ITEM)

    private fun getContext() = view.context
}