package com.trading212.diverserecycleradapter.layoutmanager

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet

/**
 * Created by svetlin.mollov on 12.12.2017 г..
 */
class DiverseLinearLayoutManager : LinearLayoutManager {

    @JvmOverloads
    @Suppress("UNUSED")
    constructor(context: Context, orientation: Int = LinearLayoutManager.VERTICAL, reverseLayout: Boolean = false) : super(context, orientation, reverseLayout)

    @Suppress("UNUSED")
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    override fun onAttachedToWindow(view: RecyclerView?) {

        super.onAttachedToWindow(view)

        delegateRecyclerViewAttachedToWindow(view!!)
    }

    override fun onDetachedFromWindow(view: RecyclerView, recycler: RecyclerView.Recycler?) {

        delegateRecyclerViewDetachedFromWindow(view)

        super.onDetachedFromWindow(view, recycler)
    }
}