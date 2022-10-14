package com.hao.mvi.base

import androidx.fragment.app.Fragment

internal fun <I : IAction, O : IUiState> Fragment.render(
    vm: BaseViewModel<I, O>,
    function: (o: O) -> Unit
) {
    vm.uiState.observe(viewLifecycleOwner, function)
}

fun <I : IAction, O : IUiState> doAction(
    vm: BaseViewModel<I, O>,
    action: I
) {
    vm.doAction(action)
}