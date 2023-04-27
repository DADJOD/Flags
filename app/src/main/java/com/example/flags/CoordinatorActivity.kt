package com.example.flags

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.google.android.material.snackbar.Snackbar

class CoordinatorActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener,
    View.OnClickListener {
    private var popupMenu: PopupMenu? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinator)

        registerForContextMenu(findViewById(R.id.cost))

        popupMenu = PopupMenu(this, findViewById(R.id.country))
        popupMenu!!.inflate(R.menu.popup)
        popupMenu!!.setOnMenuItemClickListener(this)

        findViewById<TextView>(R.id.country).setOnClickListener(this)

    }

//    invalidateOptionsMenu()

    override fun onClick(v: View?) {
        popupMenu?.show()
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.popup_menu_clear -> {
                Toast.makeText(this, "Popup Menu pressed", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false
        }
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        if (v?.id == R.id.cost) {
            menuInflater.inflate(R.menu.context, menu)
        }
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.context_menu_exit -> Toast.makeText(this, "Exit pressed", Toast.LENGTH_SHORT).show()
            R.id.context_menu_copy -> Toast.makeText(this, "Copy pressed", Toast.LENGTH_SHORT).show()
            R.id.context_menu_paste -> Toast.makeText(this, "Paste pressed", Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.main_add    -> Toast.makeText(this, "Add pressed", Toast.LENGTH_SHORT).show()
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