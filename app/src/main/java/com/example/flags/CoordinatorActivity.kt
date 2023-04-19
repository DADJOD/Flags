package com.example.flags

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class CoordinatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinator)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.main_add -> Toast.makeText(this, "Add pressed", Toast.LENGTH_SHORT).show()
            R.id.main_create -> Toast.makeText(this, "Create pressed", Toast.LENGTH_SHORT).show()
            R.id.main_delete -> Toast.makeText(this, "Delete pressed", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

    fun orderTrip(view: View) {
//        Toast.makeText(this, "clicked order Trip", Toast.LENGTH_SHORT).show()
        Snackbar.make(
            findViewById(
                R.id.coordinator
            ),
            "clicked order Trip",
            Snackbar.LENGTH_SHORT
        )
            .show()
    }
}