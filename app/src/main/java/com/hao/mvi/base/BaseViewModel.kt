package com.hao.mvi.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author 锅得铁
 * @param I a intent action
 * @param O a data
 */
abstract class BaseViewModel<I : IAction, O : IUiState> : ViewModel() {
    /**
     * Ui state launcher
     */
    private var _uiState = MutableLiveData<O>()

    /**
     *
     * Provide to view
     * @return LiveData<O>
     */
    val uiState: LiveData<O> = _uiState

    abstract fun doAction(action: I)

    fun send(o: O) {
        _uiState.postValue(o)
    }
}