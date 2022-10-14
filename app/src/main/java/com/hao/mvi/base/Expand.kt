package com.hao.mvi.base

import androidx.fragment.app.Fragment

fun <I : IAction, O : IUiState> Fragment.render(
    viewModel: BaseViewModel<I, O>,
    function: (o: O) -> Unit
) {
    viewModel.uiState().observe(viewLifecycleOwner, function)
}

fun <I : IAction, O : IUiState> doAction(
    viewModel: BaseViewModel<I, O>,
    action: I
) {
    viewModel.doAction(action)
}