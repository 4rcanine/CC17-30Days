package com.example.a30daysapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)


        val tips = generateTips()
        recyclerView.adapter = TipAdapter(tips)
    }


    data class Tip(val day: String, val title: String, val description: String, val imageRes: Int)


    private fun generateTips(): List<Tip> {
        return listOf(
            Tip("Day 1", "Salsa", "Get comfortable with basic salsa steps.", R.drawable.dap1),
            Tip("Day 2", "Hip-Hop", "Master the 2-step and relax your movements.", R.drawable.dap2),
            Tip("Day 3", "Ballet", "Work on posture and core strength.", R.drawable.dap3),
            Tip("Day 4", "Tango", "Focus on smooth and controlled steps.", R.drawable.dap4),
            Tip("Day 5", "Jazz", "Practice isolating movements like your shoulders.", R.drawable.dap5),
            Tip("Day 6", "Breakdance", "Learn a basic freeze position.", R.drawable.dap6),
            Tip("Day 7", "Waltz", "Practice the rise and fall technique.", R.drawable.dap7),
            Tip("Day 8", "Tap Dance", "Master the shuffle with toe and heel taps.", R.drawable.dap8),
            Tip("Day 9", "Contemporary", "Work on fluid transitions.", R.drawable.dap9),
            Tip("Day 10", "Ballroom", "Focus on partnership and frame.", R.drawable.dap10),
            Tip("Day 11", "Funk", "Experiment with body waves and flow.", R.drawable.dap11),
            Tip("Day 12", "Swing", "Learn the basics of Lindy Hop.", R.drawable.dap12),
            Tip("Day 13", "Latin Dance", "Focus on controlled hip movements.", R.drawable.dap13),
            Tip("Day 14", "K-Pop Dance", "Learn choreography from your favorite K-Pop song.", R.drawable.dap14),
            Tip("Day 15", "Line Dance", "Practice a simple line dance routine.", R.drawable.dap15),
            Tip("Day 16", "Bollywood", "Express with hand gestures and expressions.", R.drawable.dap16),
            Tip("Day 17", "Flamenco", "Focus on rhythmic foot taps.", R.drawable.dap17),
            Tip("Day 18", "Zumba", "Dance to boost your cardio fitness.", R.drawable.dap18),
            Tip("Day 19", "Belly Dance", "Isolate your hips for better control.", R.drawable.dap19),
            Tip("Day 20", "Afro Dance", "Try the Gwara Gwara move with grounded energy.", R.drawable.dap20),
            Tip("Day 21", "Folk Dance", "Learn a traditional folk dance.", R.drawable.dap21),
            Tip("Day 22", "Krump", "Express yourself with exaggerated movements.", R.drawable.dap22),
            Tip("Day 23", "House Dance", "Work on your footwork flow.", R.drawable.dap23),
            Tip("Day 24", "Lyrical Dance", "Dance with emotion in sync with the lyrics.", R.drawable.dap24),
            Tip("Day 25", "Reggaeton", "Practice isolating your chest and hips.", R.drawable.dap25),
            Tip("Day 26", "Modern Dance", "Experiment with improvisation techniques.", R.drawable.dap26),
            Tip("Day 27", "Street Dance", "Learn to freestyle and stay loose.", R.drawable.dap27),
            Tip("Day 28", "Disco", "Get into the groove with classic disco moves.", R.drawable.dap28),
            Tip("Day 29", "Jive", "Master quick kicks and turns.", R.drawable.dap29),
            Tip("Day 30", "Freestyle Day", "Combine everything you learned in your own routine!", R.drawable.dap30)
        )
    }


    inner class TipAdapter(private val tips: List<Tip>) :
        RecyclerView.Adapter<TipAdapter.TipViewHolder>() {


        inner class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val day: TextView = itemView.findViewById(R.id.day)
            val title: TextView = itemView.findViewById(R.id.title)
            val description: TextView = itemView.findViewById(R.id.description)
            val image: ImageView = itemView.findViewById(R.id.imageView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.tip_item, parent, false)
            return TipViewHolder(view)
        }

        override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
            val tip = tips[position]
            holder.day.text = tip.day
            holder.title.text = tip.title
            holder.description.text = tip.description
            holder.image.setImageResource(tip.imageRes)
        }


        override fun getItemCount() = tips.size
    }
}
