package API

import com.RegistrationRespond
import register.RegisterationRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("/student/register")
    fun registerStudent(@Body registerationRequest:RegisterationRequest:RegisterationRequest):Class<RegistrationRespond>
}