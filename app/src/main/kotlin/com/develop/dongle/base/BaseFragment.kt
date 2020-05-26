package com.develop.dongle.base

import androidx.annotation.LayoutRes
import dagger.android.support.DaggerFragment

abstract class BaseFragment : DaggerFragment(){

    @get:LayoutRes
    protected abstract val layoutRes: Int

}