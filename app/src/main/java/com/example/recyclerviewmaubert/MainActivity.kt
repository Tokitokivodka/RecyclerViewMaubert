package com.example.recyclerviewmaubert

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewmaubert.classe.ListBook
import com.example.recyclerviewmaubert.classe.ListBookAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var items = Array<ListBook>(10, { ListBook() })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seedItems()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ListBookAdapter(items)
    }

    fun seedItems() {
        val nameArray = resources.getStringArray(R.array.name)
        val numArray = resources.getStringArray(R.array.number)
        val imgArray = intArrayOf(
            R.drawable.hamlet,
            R.drawable.latempete,
            R.drawable.leroilear,
            R.drawable.macbeth,
            R.drawable.othello,
            R.drawable.peinedamourgagner,
            R.drawable.romeoetjuliette
        )
        for (i in 0..nameArray.size - 1) {
            items[i] = ListBook(nameArray[i], numArray[i], imgArray[i])
        }
    }
}