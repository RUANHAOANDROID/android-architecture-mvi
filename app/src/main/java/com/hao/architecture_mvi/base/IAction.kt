package com.hao.architecture_mvi.base

interface IAction {
    fun id() = "${javaClass.simpleName}${hashCode()}"
}