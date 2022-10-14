package com.hao.mvi.base

interface IUiState {
    fun id() = "${javaClass.simpleName}${hashCode()}"
}