package com

import com.google.gson.annotations.SerializedName

data class RegistrationRespond(
    var name:String,
    @SerializedName("phoneNumber")
    var email:String,
    @SerializedName("dob")
    var nationality:String,
    @SerializedName("password")
)
