package com.develop.dongle.base

import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

abstract class BaseDataBindingActivity<VM : ViewModel, VB : ViewDataBinding> : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    protected lateinit var viewModel: VM
    protected lateinit var viewDataBinding: VB

    protected abstract fun getViewModel(): Class<VM>
}