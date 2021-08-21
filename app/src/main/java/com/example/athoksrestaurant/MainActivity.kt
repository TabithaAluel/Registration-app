package com.example.athoksrestaurant

import API.APIClient
import API.ApiInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.RegistrationRespond
import javax.security.auth.callback.Callback
import javax.security.auth.callback.CallbackHandler

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
//    lateinit var btnregister: Button
//    lateinit var etname:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    setupSpinner()


    }
    fun setupSpinner(){}
    val nationalities= arrayListOf("Select Nationality", "Kenyan", "South Sudanese", "Rwandan", "Sudanese")
    val nationalityAdapter= arrayListOf(baseContext, android.R.layout.simple_expandable_list_item_1, nationalities)



}
    if(!error){
        binding.pbRegistration.visibility= View.GONE
      var regRespond=RegistrationRespond(name = name,
          phoneNumber= phone,
          email=email,
          nationality=nationality,
          password=password
      )
    var retrofit=APIClient.buildApiClient(ApiInterface:class.java)
    var request=retrofit.registerStudent(regRespond)
    request.enqueue(object: Callback<RegistrationRespond>{
        override fun onRequest(
            call:Call<RegistrationRespond>

        )
    }


}