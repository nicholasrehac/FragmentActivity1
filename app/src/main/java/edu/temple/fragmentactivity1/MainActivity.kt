package edu.temple.fragmentactivity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentContainerView2 = findViewById<FragmentContainerView>(R.id.fragmentContainerView2)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView2, ColorFragment())
            .commit()

    }
}