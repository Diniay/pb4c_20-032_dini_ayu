package com.example.novel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var recyclerViewNovelAdapter : RecyclerViewNovelAdapter? = null
    private var novelList = mutableListOf<Novel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        novelList =  ArrayList()

        recyclerView = findViewById<View>(R.id.rvNovelLists) as RecyclerView
        recyclerViewNovelAdapter = RecyclerViewNovelAdapter(this@MainActivity, novelList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager (this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewNovelAdapter

        prepareNovelListData ()

    }

    private fun prepareNovelListData() {
        var novel = Novel ("Bintang TereLiye", R.drawable.bintang)
        novelList.add(novel)
        novel = Novel ("Selena TereLiye", R.drawable.selena)
        novelList.add(novel)
        novel = Novel ("Pulang TereLiye", R.drawable.pulang)
        novelList.add(novel)
        novel = Novel ("Pergi TereLiye", R.drawable.pergi)
        novelList.add(novel)
        novel = Novel ("Hujan TereLiye", R.drawable.hujan)
        novelList.add(novel)
        novel = Novel ("Bumi TereLiye", R.drawable.bumi)
        novelList.add(novel)
        novel = Novel ("Bintang TereLiye", R.drawable.bintang)
        novelList.add(novel)
        novel = Novel ("Selena TereLiye", R.drawable.selena)
        novelList.add(novel)
        novel = Novel ("Pulang TereLiye", R.drawable.pulang)
        novelList.add(novel)
        novel = Novel ("Pergi TereLiye", R.drawable.pergi)
        novelList.add(novel)
        novel = Novel ("Bintang TereLiye", R.drawable.bintang)
        novelList.add(novel)
        novel = Novel ("Selena TereLiye", R.drawable.selena)
        novelList.add(novel)
        novel = Novel ("Pulang TereLiye", R.drawable.pulang)
        novelList.add(novel)
        novel = Novel ("Pergi TereLiye", R.drawable.pergi)
        novelList.add(novel)
        novel = Novel ("Hujan TereLiye", R.drawable.hujan)
        novelList.add(novel)
        novel = Novel ("Bumi TereLiye", R.drawable.bumi)
        novelList.add(novel)

        recyclerViewNovelAdapter!!.notifyDataSetChanged()
    }
}