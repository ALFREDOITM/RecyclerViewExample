package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewexample.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"Como preparar leche con cereal\", \"channel\": \"WikiHow\", \"views\": \"6k views\", \"datePosted\": \"10 days ago\", \"duration\": \"10:00\"}"),
            JSONObject("{\"title\": \"How to program in Kotlin like a pro\", \"channel\": \"KotlinMaster10\", \"views\": \"10k views\", \"datePosted\": \"15 days ago\", \"duration\": \"50:00\"}"),
            JSONObject("{\"title\": \"Huevos con aceite\", \"channel\": \"Twisted Sisters\", \"views\": \"6k view\", \"datePosted\": \"5 days ago\", \"duration\": \"06:40\"}"),
            JSONObject("{\"title\": \"Agua de la llave\", \"channel\": \"VEVO oficial\", \"views\": \"10k view\", \"datePosted\": \"30 days ago\", \"duration\": \"04:20\"}"),
            JSONObject("{\"title\": \"That weeb song\", \"channel\": \"Rev says desu\", \"views\": \"1k view\", \"datePosted\": \"3 days ago\", \"duration\": \"04:09\"}")
        )
        binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}