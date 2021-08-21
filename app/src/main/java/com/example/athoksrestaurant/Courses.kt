package com.example.athoksrestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Courses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
    }
    fun Courses(){
        var courseList= listOf<Course>(

            Course("Kotlin","mk000","Frotend","John"),
            Course("Kotlin","mk000","Frotend","John"),
            Course("Kotlin","mk000","Frotend","John"),
            Course("Kotlin","mk000","Frotend","John"),

            )
        var coursesRvAdapter=coursesRvAdaper(courseList)

    }
}