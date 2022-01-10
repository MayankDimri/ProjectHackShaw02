package com.aitclubs.hackshaw.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.aitclubs.hackshaw.*
import com.aitclubs.hackshaw.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        binding.imageButton1.setOnClickListener {
            val intent1 = Intent(activity, driveBooks::class.java)
            startActivity(intent1)
        }

        binding.imageButton8.setOnClickListener {
            val intent2 = Intent(activity, driveAssignment::class.java)
            startActivity(intent2)
        }

        binding.imageButton7.setOnClickListener {
            val intent3 = Intent(activity, driveNotes::class.java)
            startActivity(intent3)
        }

        binding.imageButton2.setOnClickListener {
            val intent4 = Intent(activity, timetable::class.java)
            startActivity(intent4)
        }

        binding.imageButton4.setOnClickListener {
            val intent9 = Intent(activity, comingSoon::class.java)
            startActivity(intent9)
        }

        binding.imageButton6.setOnClickListener {
            val intent10 = Intent(activity, comingSoon::class.java)
            startActivity(intent10)
        }

        binding.imageButton3.setOnClickListener {
            val intent11 = Intent(activity, scolarship::class.java)
            startActivity(intent11)
        }

        binding.imageButton5.setOnClickListener {
            val intent12 = Intent(activity, placement::class.java)
            startActivity(intent12)
        }

        binding.button2.setOnClickListener {
            Toast.makeText(context,"Sorry, This Button Does not Work Now...", Toast.LENGTH_LONG).show()
        }



    }
}