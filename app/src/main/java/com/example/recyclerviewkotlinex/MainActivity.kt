package com.example.recyclerviewkotlinex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewkotlinex.databinding.ActivityMainBinding
import com.example.recyclerviewkotlinex.model.User
import com.example.recyclerviewkotlinex.model.UsersListener
import com.example.recyclerviewkotlinex.model.UsersService
import com.example.recyclerviewkotlinex.screens.UsersListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, UsersListFragment())
                .commit()
        }
    }
}