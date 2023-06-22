package com.example.recyclerviewkotlinex

import android.app.Application
import com.example.recyclerviewkotlinex.model.UsersService

class App : Application() {
    val usersService = UsersService()
}