package com.example.recyclerviewkotlinex

import com.example.recyclerviewkotlinex.model.User

interface Navigator {
    fun showDetails(user: User)

    fun goBack()

    fun toast(messageRes: Int)
}