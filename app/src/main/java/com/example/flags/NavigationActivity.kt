package com.example.flags

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigationActivity : AppCompatActivity(),
    BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var action: TextView
    private lateinit var bottom: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        action = findViewById(R.id.action_bottom)
        bottom = findViewById(R.id.navigation)

        bottom.setOnNavigationItemSelectedListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.bottom_git -> {
                action.text = "GIT"; true
            }

            R.id.bottom_home -> {
                action.text = "HOME"; true
            }

            R.id.bottom_svn -> {
                action.text = "SVN"; true
            }

            else -> {
                false
            }
        }
    }
}