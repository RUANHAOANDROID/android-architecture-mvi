package com.hao.architecture_mvi.base

interface IUiState {
    fun id() = "${javaClass.simpleName}${hashCode()}"
}