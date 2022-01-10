package com.aitclubs.hackshaw.ui.notifications

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aitclubs.hackshaw.R
import com.aitclubs.hackshaw.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private lateinit var _bindingn: FragmentNotificationsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _bindingn = FragmentNotificationsBinding.inflate(layoutInflater)
        return _bindingn.root
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        _bindingn.clubsButton1.setOnClickListener{
            var intentc1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://aitoss.club/"))
            startActivity(intentc1)
        }
        _bindingn.clubsButton2.setOnClickListener{
            var intentc2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://gdsc.community.dev/army-institute-of-technology-pune/"))
            startActivity(intentc2)
        }
        _bindingn.clubsButton3.setOnClickListener{
            var intentc3 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/aittechnicalboard/"))
            startActivity(intentc3)
        }
        _bindingn.clubsButton4.setOnClickListener{
            var intentc4 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ddqclub/"))
            startActivity(intentc4)
        }
        _bindingn.clubsButton5.setOnClickListener{
            var intentc5 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/culturalboard_ait/"))
            startActivity(intentc5)
        }
        _bindingn.clubsButton6.setOnClickListener{
            var intentc6 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/fine._.arts._.ait/"))
            startActivity(intentc6)
        }
        _bindingn.clubsButton7.setOnClickListener{
            var intentc7 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/aitsportsclub/"))
            startActivity(intentc7)
        }
        _bindingn.clubsButton8.setOnClickListener{
            var intentc8 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/magboard/"))
            startActivity(intentc8)
        }
        _bindingn.clubsButton9.setOnClickListener{
            var intentc9 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/robotics.club_ait/"))
            startActivity(intentc9)
        }
        _bindingn.clubsButton10.setOnClickListener{
            var intentc10 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ait_spiritual_club/"))
            startActivity(intentc10)
        }
        _bindingn.clubsButton11.setOnClickListener{
            Toast.makeText(context,"Sorry, We dont have link for AIT Coding Cell", Toast.LENGTH_LONG).show()
        }
        _bindingn.clubsButton12.setOnClickListener{
            var intentc12 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/isdf_ait/"))
            startActivity(intentc12)
        }
        _bindingn.clubsButton13.setOnClickListener{
            var intentc13 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/172772513140294"))
            startActivity(intentc13)
        }
        _bindingn.clubsButton14.setOnClickListener{
            var intentc14 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/radioraaga/"))
            startActivity(intentc14)
        }
        _bindingn.clubsButton15.setOnClickListener{
            var intentc15 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ait_nssclub/"))
            startActivity(intentc15)
        }
        _bindingn.clubsButton16.setOnClickListener{
            var intentc16 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ait_nature_club/"))
            startActivity(intentc16)
        }




    }

}