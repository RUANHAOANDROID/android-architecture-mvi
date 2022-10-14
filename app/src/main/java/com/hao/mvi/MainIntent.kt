package com.hao.mvi

import com.hao.mvi.base.IAction
import com.hao.mvi.base.IUiState

sealed class MainAction : IAction {
    object Plus : MainAction()
    object Minus : MainAction()
}

sealed class MainUiState : IUiState {
    class Request(val number: Int) : MainUiState()
}