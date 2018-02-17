package com.iavariav.root.recyclerviewmvpkotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iavariav.root.recyclerviewmvpkotlin.R
import com.iavariav.root.recyclerviewmvpkotlin.model.Users
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_recyclerview.view.*

/**
 * Created by root on 2/17/18.
 */
class RecyclerViewAdapter(data : ArrayList<Users>) : RecyclerView.Adapter<RecyclerViewAdapter.MyHolder>() {

    lateinit var ambilData : ArrayList<Users>
    init {
        ambilData = data
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {
        var view =LayoutInflater.from(parent?.context).inflate(R.layout.item_recyclerview, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return ambilData.count()
    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {

        holder?.bind(ambilData.get(position))
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(ambilData: Users) {
            itemView.tvItemNama.text = ambilData.nama
            itemView.tvItemAlamat.text = ambilData.alamat
        }

    }

}