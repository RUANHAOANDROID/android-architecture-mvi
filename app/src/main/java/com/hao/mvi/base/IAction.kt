package com.hao.mvi.base

interface IAction {
    fun id() = "${javaClass.simpleName}${hashCode()}"
}