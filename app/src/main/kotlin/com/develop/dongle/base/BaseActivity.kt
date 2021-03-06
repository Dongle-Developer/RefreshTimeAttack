package com.develop.dongle.base

import androidx.annotation.LayoutRes
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity : DaggerAppCompatActivity() {

    @get:LayoutRes
    protected abstract val layoutRes: Int
}