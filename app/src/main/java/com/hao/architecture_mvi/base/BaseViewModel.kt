package com.hao.architecture_mvi.base

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
    protected var uiState = MutableLiveData<O>()

    /**
     *
     * Provide to view
     * @return LiveData<O>
     */
    fun uiState(): LiveData<O> = uiState

    abstract fun doAction(action: I)

}