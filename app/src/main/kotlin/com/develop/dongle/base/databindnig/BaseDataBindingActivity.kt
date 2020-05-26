package com.develop.dongle.base.databindnig

import android.os.Bundle
import android.os.PersistableBundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.develop.dongle.base.BaseActivity
import javax.inject.Inject

abstract class BaseDataBindingActivity<VM : ViewModel, VB : ViewDataBinding> : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    protected lateinit var viewModel: VM
    protected lateinit var viewDataBinding: VB

    protected abstract fun getViewModel(): Class<VM>
    protected abstract fun initLiveData()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        viewDataBinding = DataBindingUtil.setContentView<VB>(this, layoutRes).apply {
            lifecycleOwner = this@BaseDataBindingActivity
        }
        viewModel = ViewModelProviders.of(this)[getViewModel()]
    }
}
