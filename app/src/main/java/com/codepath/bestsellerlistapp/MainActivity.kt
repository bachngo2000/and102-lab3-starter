package com.codepath.bestsellerlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codepath.bestsellerlistapp.R.id

/**
 * The MainActivity for the BestSellerList app.
 * Launches a [BestSellerBooksFragment].
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        // creates a BestSellerBooksFragment
        fragmentTransaction.replace(id.content, BestSellerBooksFragment(), null).commit()
    }
}