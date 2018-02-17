package com.iavariav.root.recyclerviewmvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.iavariav.root.recyclerviewmvpkotlin.adapter.RecyclerViewAdapter
import com.iavariav.root.recyclerviewmvpkotlin.model.Users
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), UserView {
    lateinit var userPresenterImp: UserPresenterImp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initPresenter()
        initView()
    }

    private fun initView() {
        btnSubmit.setOnClickListener {
            userPresenterImp.addList(edtNama.text.toString(), edtAlamat.text.toString())

        }
    }

    private fun initPresenter() {
        userPresenterImp = UserPresenterImp(this)
    }

    override fun berhasil(datas: ArrayList<Users>) {
//        masukan Aapter

        var adapter = RecyclerViewAdapter(datas)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)
    }

    override fun noSucces(pesan: String) {

    }
}
