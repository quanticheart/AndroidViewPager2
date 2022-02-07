package br.com.appfactory.androidviewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyFragmentAdapter2(fa: FragmentActivity, private val list: List<Fragment>) :
    FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = list.size

    override fun createFragment(position: Int): Fragment = list[position]
}