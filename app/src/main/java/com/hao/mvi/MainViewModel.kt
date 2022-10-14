package com.hao.mvi

import android.util.Log
import com.hao.mvi.base.BaseViewModel

/**
 *  viewModel
 * @date 2022/10/14
 * @author 锅得铁
 * @since v1.0
 */
class MainViewModel : BaseViewModel<MainAction, MainUiState>() {
    private var number: Int = 0

    companion object {
        private const val TAG = "MainViewModel"
    }

    override fun doAction(action: MainAction) {
        Log.d(TAG, "doAction: $action")
        when (action) {
            MainAction.Minus -> {
                number--
                uiState.postValue(MainUiState.Request(number))
            }
            MainAction.Plus -> {
                number++
                uiState.postValue(MainUiState.Request(number))
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "onCleared: $number")
    }
}