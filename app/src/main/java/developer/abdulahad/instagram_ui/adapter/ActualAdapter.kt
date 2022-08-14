package developer.abdulahad.instagram_ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import developer.abdulahad.instagram_ui.R
import developer.abdulahad.instagram_ui.databinding.FragmentBlank3Binding
import kotlinx.android.synthetic.main.insta_glavniy.view.*

class ActualAdapter(var list: List<User3>) : RecyclerView.Adapter<ActualAdapter.Vh>() {
    lateinit var binding: FragmentBlank3Binding
    inner class Vh(var itemView: View) : RecyclerView.ViewHolder(itemView){
        fun onBind(user : User3) {
            itemView.txt_item.text = user.name
            when(user.number){
                1 ->itemView.profile_image.setImageResource(R.drawable.istorya1)
                2 ->itemView.profile_image.setImageResource(R.drawable.istorya1)
                3 ->itemView.profile_image.setImageResource(R.drawable.istorya2)
                4 ->itemView.profile_image.setImageResource(R.drawable.istorya3)
                5 ->itemView.profile_image.setImageResource(R.drawable.istorya4)
                6 ->itemView.profile_image.setImageResource(R.drawable.istorya5)
                7 ->itemView.profile_image.setImageResource(R.drawable.istorya6)
                8 ->itemView.profile_image.setImageResource(R.drawable.istorya6)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.insta_glavniy, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}