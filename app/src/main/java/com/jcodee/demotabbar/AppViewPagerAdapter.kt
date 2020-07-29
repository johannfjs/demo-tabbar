package com.jcodee.demotabbar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class AppViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ItemFragment.newInstance()
            1 -> ItemFragment.newInstance()
            else -> ItemFragment.newInstance()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}