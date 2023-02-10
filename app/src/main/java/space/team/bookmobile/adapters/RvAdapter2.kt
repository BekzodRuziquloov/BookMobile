package space.team.bookmobile.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import space.team.bookmobile.Info
import space.team.bookmobile.databinding.ImageitemBinding

class RvAdapter2(var list: List<Info>) : RecyclerView.Adapter<RvAdapter2.Vh>() {
    inner class Vh(var itemRvBinding: ImageitemBinding) :
        RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(myContact: Info, position: Int) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ImageitemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size


}

