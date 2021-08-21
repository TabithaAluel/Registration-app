package com.example.athoksrestaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class coursesRvAdaper(var courseLIst:List<Course>): RecyclerView.Adapter<CoursesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        var itemView=LayoutInflater.from(parent.context)
        return CoursesViewHolder (itemView)
    }

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        var currentCourse=courseLIst.get(position)
        holder.tvcoursename.text=currentCourse.courseName
        holder.tvdescription.text=currentCourse.description
        holder.tvcoursecode.text=currentCourse.courseCode
        holder.tvcourseInstructor.text=currentCourse.instructor


    }

    override fun getItemCount(): Int {
        return courseLIst.size
    }

}
class CoursesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvcoursename=itemView.findViewById<TextView>(R.id.tvcoursename)
    var tvdescription=itemView.findViewById<TextView>(R.id.tvcoursdesription)
    var tvcoursecode=itemView.findViewById<TextView>(R.id.tvcoursecode)
    var tvcourseInstructor=itemView.findViewById<TextView>(R.id.tvcoursInstructor)


}

