package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import coil.load
import com.example.test1.databinding.ActivityDetailScreenBinding

class DetailScreen : AppCompatActivity() {

    lateinit var binding: ActivityDetailScreenBinding
    lateinit var freak: Freak

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        freak = intent.extras?.getSerializable("freak") as Freak
        initViews()

    }

    private fun initViews() {
        binding.descriptionTV.text=freak.description
        binding.skillsTV.text = getString(R.string.skills_template, freak.skills.joinToString(", "))
        binding.projectsTV.text = getString(R.string.projects_template, freak.projects.joinToString(", "))
        binding.titleTV.text = getString(R.string.title_template,freak.role,freak.norm)
        binding.levelTV.text = getString(R.string.level_project,freak.level)
        binding.imageView.load(freak.image)
    }

}