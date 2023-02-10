package space.team.bookmobile.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import space.team.bookmobile.Info
import space.team.bookmobile.databinding.RectengleItemBinding
import space.team.bookmobile.databinding.SquareItemBinding

class RvAdapter3(var list: List<Info>) : RecyclerView.Adapter<RvAdapter3.Vh>() {
    inner  class Vh(var itemRvBinding: RectengleItemBinding): RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(myContact: Info, position: Int) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(RectengleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position] ,position)
    }

    override fun getItemCount(): Int =list.size



}