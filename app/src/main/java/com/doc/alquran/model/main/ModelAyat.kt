package com.doc.alquran.model.main

import com.google.gson.annotations.SerializedName


/**
 * Created by Rosita on 19-11-2021
 */

class ModelAyat {
    @SerializedName("ar")
    lateinit var arab: String

    @SerializedName("id")
    lateinit var indo: String

    @SerializedName("nomor")
    lateinit var nomor: String
}