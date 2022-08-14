package developer.abdulahad.instagram_ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import developer.abdulahad.instagram_ui.R
import kotlinx.android.synthetic.main.insta_glavniy.view.*

class Adapter(var list: List<User>) : RecyclerView.Adapter<Adapter.Vh>() {
    inner class Vh(var itemView: View) : RecyclerView.ViewHolder(itemView){
        fun onBind(user : User) {
           itemView.txt_item.text = user.name
           when(user.name){
               "d1lshodov.."->itemView.profile_image.setImageResource(R.drawable.abd)
               "muhammado.."->itemView.profile_image.setImageResource(R.drawable.abdusamid)
               "kh1kmatul.."->itemView.profile_image.setImageResource(R.drawable.asadulloh)
               "marufov_o21"->itemView.profile_image.setImageResource(R.drawable.oyatillo)
               "dili.me...."->itemView.profile_image.setImageResource(R.drawable.dilime)
               "alixanov_.."->itemView.profile_image.setImageResource(R.drawable.timur)
               "Usmonali_20"->itemView.profile_image.setImageResource(R.drawable.usmonoali)
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