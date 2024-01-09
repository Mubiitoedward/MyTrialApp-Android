package com.example.mytrialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.mytrialapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        swapFragment(FavoriteFragment())
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId){
                R.id.menu_favorite -> swapFragment(FavoriteFragment())
                R.id.menu_things -> swapFragment(ThingsFragment())
                R.id.menu_routines -> swapFragment(RoutinesFragment())
                R.id.menu_ideas -> swapFragment(IdeasFragment())
                R.id.menu_settings -> swapFragment(SettingsFragment())
                else -> {

                }
            }
            true


        }


    }
    private fun swapFragment(fragment: Fragment) {
        val fragSup = supportFragmentManager
        val fragCha = fragSup.beginTransaction()
        fragCha.replace(R.id.frame_layout, fragment)
        fragCha.commit()
    }
}