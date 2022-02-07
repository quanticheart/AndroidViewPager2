package br.com.appfactory.androidviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager.adapter = MyFragmentAdapter(this)
        TabLayoutMediator(tabs, pager) { tab, position ->
            tab.text = "Aba $position"
        }.attach()
    }
}