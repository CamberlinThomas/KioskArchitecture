package com.decathlon.profile_data.model

data class ProfileDTO(
    val firstName: String,
    val lastName: String,
    val birthDate: Long,
    val databaseId:Int,
    val signUpDate: Int
)