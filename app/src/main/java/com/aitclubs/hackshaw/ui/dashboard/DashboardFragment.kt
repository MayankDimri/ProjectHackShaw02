package com.aitclubs.hackshaw.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aitclubs.hackshaw.*
import com.aitclubs.hackshaw.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private lateinit var _bindinga: FragmentDashboardBinding

    // This property is only valid between onCreateView and
    // onDestroyView.

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _bindinga = FragmentDashboardBinding.inflate(layoutInflater)
        return _bindinga.root
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        _bindinga.Lecturesid.setOnClickListener {
            val intent5 = Intent(activity, driveNotes::class.java)
            startActivity(intent5)
        }
        _bindinga.assignmentsid.setOnClickListener {
            val intent6 = Intent(activity, driveAssignment::class.java)
            startActivity(intent6)
        }
        _bindinga.booksid.setOnClickListener {
            val intent7 = Intent(activity, driveBooks::class.java)
            startActivity(intent7)
        }
            _bindinga.ytchannelid.setOnClickListener{
            val intent8 = Intent(activity, listofyoutubechannels::class.java)
            startActivity(intent8)
        }



        }
    }
