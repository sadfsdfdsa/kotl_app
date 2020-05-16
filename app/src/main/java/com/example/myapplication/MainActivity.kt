package com.example.myapplication

import android.graphics.Color
import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_second.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var userName: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setTitle("Test")

        // default fragment
        setActiveFragment(MainFragment())

        // listeners
        setListeners()
    }

    private fun setActiveFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(FrameLayoutMain.id, fragment)
            .addToBackStack(null)
            .commit()
    }

    private fun setListeners() {

        buttonFr1.setOnClickListener {
            setActiveFragment(MainFragment())
        }

        buttonFr2.setOnClickListener {
            setActiveFragment(SecondFragment.newInstance(editTextName.text.toString()))
        }
    }

}
