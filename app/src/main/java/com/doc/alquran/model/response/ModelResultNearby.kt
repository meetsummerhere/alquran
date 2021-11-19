package com.doc.alquran.model.response

import com.google.gson.annotations.SerializedName
import com.doc.alquran.model.nearby.ModelResults


/**
 * Created by Rosita on 19-11-2021
 */

class ModelResultNearby {
    @SerializedName("results")
    lateinit var modelResults: List<ModelResults>
}