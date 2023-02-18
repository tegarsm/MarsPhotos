package com.example.android.marsphotos.network

import com.squareup.moshi.Json

/**
 * Mendefinisikan foto mars yang menyertakan ID dan Url gambar
 * Nama properti dari kelas data ini digunakan oleh Moshi untuk mencocokkan nama nilai di JSON. */
data class MarsPhoto(
        val id: String,
        // digunakan untuk memetakan img_src dari JSON ke imgSrcUrl di kelas kita
        @Json(name = "img_src") val imgSrcUrl: String
)
