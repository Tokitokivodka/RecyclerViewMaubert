package com.example.recyclerviewmaubert.classe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewmaubert.R
import kotlinx.android.synthetic.main.list_book.view.*

class ListBookAdapter(val items: Array<ListBook>) :
    RecyclerView.Adapter<ListBookAdapter.ViewHolder>() {
    //Fonctions héritées
    override fun getItemCount(): Int = items.size

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.list_book))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAndVersion(items[position])
    }

    //ViewHolder
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindAndVersion(andVersion: ListBook) {
            with(andVersion) {
                itemView.listBookName.text = "$name"
                itemView.listBookNum.text = "$verNum"
                itemView.listBookImg.setImageResource(img)
            }
        }
    }
}