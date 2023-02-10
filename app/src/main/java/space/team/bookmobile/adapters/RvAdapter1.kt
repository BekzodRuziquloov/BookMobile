package space.team.bookmobile.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import space.team.bookmobile.Info
import space.team.bookmobile.R
import space.team.bookmobile.databinding.SquareItemBinding

class RvAdapter1(var list: List<Info>) : RecyclerView.Adapter<RvAdapter1.Vh>() {
    inner  class Vh(var itemRvBinding: SquareItemBinding):RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(myContact: Info, position: Int) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(SquareItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position] ,position)
    }

    override fun getItemCount(): Int =list.size



}