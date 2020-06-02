package com.develop.dongle.base.databindnig

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.recyclerview.widget.RecyclerView

abstract class BaseDataBindingAdapter<ITEM> :
    RecyclerView.Adapter<BaseDataBindingViewHolder<ITEM>>(), LifecycleObserver {

    private val items = mutableListOf<ITEM>()

    fun getItems() = items

    fun getPosiotionItem(position: Int) = items[position]

    fun setItems(newItems: List<ITEM>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    fun addItems(newItems: List<ITEM>) {
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    fun removeItem(position: Int) {
        items.removeAt(position)
    }

    fun clearItems() {
        items.clear()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    protected abstract fun getViewHolder(
        @LayoutRes layout: Int,
        view: View
    ): BaseDataBindingViewHolder<ITEM>

    override fun onCreateViewHolder(parent: ViewGroup, layout: Int) =
        getViewHolder(layout, inflateView(parent, layout))

    private fun inflateView(viewGroup: ViewGroup, @LayoutRes layout: Int): View {
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        return layoutInflater.inflate(layout, viewGroup, false)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public fun onDestroyed() {
        this.clearItems()
    }
}