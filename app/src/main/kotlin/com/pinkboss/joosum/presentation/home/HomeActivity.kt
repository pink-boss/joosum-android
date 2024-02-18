package com.pinkboss.joosum.presentation.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.pinkboss.joosum.R
import com.pinkboss.joosum.databinding.ActivityHomeBinding
import com.pinkboss.joosum.presentation.home.folder.FolderFragment
import com.pinkboss.joosum.presentation.home.info.InfoFragment

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = ContextCompat.getColor(this, R.color.paperabovebg)

        binding.bottomNavigationHome.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.container_home, HomeFragment())
                    transaction.commit()
                    true
                }

                R.id.navigation_folder -> {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.container_home, FolderFragment())
                    transaction.commit()
                    true
                }

                R.id.navigation_info -> {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.container_home, InfoFragment())
                    transaction.commit()
                    true
                }

                else -> false
            }
        }
    }
}