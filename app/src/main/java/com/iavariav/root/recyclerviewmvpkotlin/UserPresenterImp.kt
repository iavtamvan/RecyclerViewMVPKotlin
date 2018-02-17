package com.iavariav.root.recyclerviewmvpkotlin

import com.iavariav.root.recyclerviewmvpkotlin.model.Users

/**
 * Created by root on 2/17/18.
 */
class UserPresenterImp : UserPresenter{
    var userView : UserView? = null
    var data : ArrayList<Users>? = null

    constructor(userView: UserView?) {
        this.userView = userView
        data = ArrayList<Users>()
    }

    override fun addList(nama: String, alamat: String) {
//        insert to model user
        var model = Users(nama, alamat)
//        deklarasi array
//        var data = ArrayList<Users>()
        data?.add(model)

        userView?.berhasil(data!!) // !! Berarti TRY Catch dan Exception
    }
}