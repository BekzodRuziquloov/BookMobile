package space.team.bookmobile

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import space.team.bookmobile.adapters.RvAdapter1
import space.team.bookmobile.adapters.RvAdapter2
import space.team.bookmobile.adapters.RvAdapter3
import space.team.bookmobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val list = ArrayList<Info>()
        for (i in 0..10) {
            list.add(Info(R.drawable.surat, "First$i", 196))
        }
        binding.rv2.adapter = RvAdapter1(list)
//        binding.rv3.adapter = RvAdapter1(list)
        binding.rv.adapter = RvAdapter3(list)
        binding.rv3.adapter = RvAdapter2(list)
        var b = 0
        binding.search.addOnLayoutChangeListener { v, left, top, right, bottom, oldLeft, oldTop, oldRight, oldBottom ->
            if (b == 0) {
                binding.image.visibility = View.VISIBLE
                b = 1
            } else {
                binding.image.visibility = View.INVISIBLE
                b = 0
            }

        }
    }
}