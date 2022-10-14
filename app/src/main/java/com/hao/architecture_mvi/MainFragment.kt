package com.hao.architecture_mvi

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.hao.architecture_mvi.base.BaseFragment
import com.hao.architecture_mvi.base.doAction
import com.hao.architecture_mvi.base.render
import com.hao.architecture_mvi.databinding.FragmentMainBinding

/**
 * Simple example
 *
 * @see MainAction
 * @see MainUiState
 * @see MainViewModel
 *
 */
class MainFragment : BaseFragment() {
    /**
     * View model 在生命周期内仅初始化一次
     */
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }


    /**
     * binding 在生命周期内仅初始化一次
     */
    private val binding: FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater).apply {
            viewClick()
        }
    }

    /**
     * 以扩展的方式在视图中注册点击事件
     *
     */
    private fun FragmentMainBinding.viewClick() {
        btnAddition.setOnClickListener { doAction(viewModel, MainAction.Plus) }
        btnSubtraction.setOnClickListener { doAction(viewModel, MainAction.Minus) }
    }

    override fun layout() = binding.root

    /**
     * 生命周期仅走一次
     *
     * @param view
     * @param savedInstanceState
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        render(viewModel) { uiState ->
            Log.d(TAG, "viewRender: $uiState")
            if (uiState is MainUiState.Request) {
                binding.tvNumber.text = "request:${uiState.number}\n Intent state:${uiState.id()}"
            }
        }
        Log.d(TAG, "onViewCreated: ")
    }

    companion object {
        const val TAG = "MainFragment"
    }
}