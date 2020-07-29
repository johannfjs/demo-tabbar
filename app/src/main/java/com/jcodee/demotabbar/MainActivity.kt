package com.jcodee.demotabbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = AppViewPagerAdapter(supportFragmentManager, lifecycle)
        TabLayoutMediator(tabLayout, viewPager, TabLayoutMediator.TabConfigurationStrategy { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Elemento $position"
                    tab.icon = getDrawable(R.drawable.ic_launcher_background)
                }
                1 -> {
                    tab.text = "Producto $position"
                }
                2 -> {
                    tab.text = "Tienda $position"
                }
            }
        }).attach()
    }
}