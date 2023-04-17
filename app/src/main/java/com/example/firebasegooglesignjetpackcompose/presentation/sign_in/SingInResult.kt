package com.example.firebasegooglesignjetpackcompose.presentation.sign_in

data class SingInResult(
    val data:UserData?,
    val errorMessage:String?
)
data class UserData(
    val userId:String,
    val userName:String?,
    val profilePictureUrl:String?

)