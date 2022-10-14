package com.hao.architecture_mvi

import com.hao.architecture_mvi.base.IAction
import com.hao.architecture_mvi.base.IUiState

sealed class MainAction : IAction {
    object Plus : MainAction()
    object Minus : MainAction()
}

sealed class MainUiState : IUiState {
    class Request(val number: Int) : MainUiState()
}