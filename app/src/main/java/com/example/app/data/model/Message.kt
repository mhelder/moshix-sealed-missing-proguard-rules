package com.example.app.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import dev.zacsweers.moshix.sealed.annotations.DefaultObject
import dev.zacsweers.moshix.sealed.annotations.TypeLabel

@JsonClass(generateAdapter = true, generator = "sealed:type")
sealed class Message {

    @TypeLabel("success")
    @JsonClass(generateAdapter = true)
    data class Success(
        @Json(name = "value")
        val value: String
    ) : Message()

    @DefaultObject
    object Unknown : Message()
}