package com.doc.alquran.model.nearby

import com.google.gson.annotations.SerializedName


/**
 * Created by Rosita on 19-11-2021
 */

class ModelLocation {
    @SerializedName("lat")
    var lat: Double = 0.0

    @SerializedName("lng")
    var lng: Double = 0.0
}