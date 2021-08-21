package register

import com.google.gson.annotations.SerializedName

data class RegisterationRequest(
    var name:String,
    @SerializedName("Name")
    var phoneNumber:String,
    var email:String,
    var dob:String,
    var nationality:String,
    var password:String,
)
