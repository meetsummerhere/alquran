package com.doc.alquran.model.nearby

import com.google.gson.annotations.SerializedName
import java.io.Serializable


/**
 * Created by Rosita on 19-11-2021
 */

class ModelResults : Serializable {
    @SerializedName("geometry")
    lateinit var modelGeometry: ModelGeometry

    @SerializedName("name")
    lateinit var name: String

    @SerializedName("vicinity")
    lateinit var vicinity: String

    @SerializedName("place_id")
    lateinit var placeId: String

    @SerializedName("rating")
    var rating = 0.0
}