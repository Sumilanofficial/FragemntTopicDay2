package com.matrix.fragemnttopicday2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.matrix.fragemnttopicday2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding?=null
    var activityInterface: ActivityInterface?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding?.btnChangeFragment0Text?.setOnClickListener {
            activityInterface?.changeFragmentText()
        }
    }
    fun changeActivityText() {
        binding?.btnChangeFragment0Text?.setText("This is changed from fragement")
    }
}