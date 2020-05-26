package com.develop.dongle.base.databindnig

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.develop.dongle.base.BaseFragment
import javax.inject.Inject

abstract class BaseDataBindingFragment<VM : ViewModel, VB : ViewDataBinding> : BaseFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    protected lateinit var viewModel: VM
    protected lateinit var viewDataBinding: VB

    protected abstract fun getViewModel(): Class<VM>
    protected abstract fun initLiveData()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding =
            binding(inflater, layoutRes, container).apply { lifecycleOwner = viewLifecycleOwner }

        viewModel = ViewModelProviders.of(this)[getViewModel()]
        return viewDataBinding.root
    }

    protected inline fun binding(
        inflater: LayoutInflater,
        layoutRes: Int,
        container: ViewGroup?
    ): VB = DataBindingUtil.inflate(inflater, layoutRes, container, false)
}



