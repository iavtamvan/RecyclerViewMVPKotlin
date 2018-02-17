package com.iavariav.root.recyclerviewmvpkotlin

import com.iavariav.root.recyclerviewmvpkotlin.model.Users

/**
 * Created by root on 2/17/18.
 */
interface UserView {

    fun berhasil(datas : ArrayList<Users>)

    fun noSucces(pesan : String)


}