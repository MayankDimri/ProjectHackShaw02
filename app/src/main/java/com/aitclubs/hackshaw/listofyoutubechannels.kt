package com.aitclubs.hackshaw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.text.method.LinkMovementMethod

class listofyoutubechannels : AppCompatActivity() {

    private lateinit var link01:TextView
    private lateinit var link02:TextView
    private lateinit var link03:TextView
    private lateinit var link04:TextView
    private lateinit var link05:TextView
    private lateinit var link06:TextView
    private lateinit var link07:TextView
    private lateinit var link08:TextView
    private lateinit var link09:TextView
    private lateinit var link10:TextView
    private lateinit var link11:TextView
    private lateinit var link12:TextView
    private lateinit var link13:TextView
    private lateinit var link14:TextView
    private lateinit var link15:TextView
    private lateinit var link16:TextView
    private lateinit var link17:TextView
    private lateinit var link18:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listofyoutubechannels)

        link01=findViewById(R.id.maths01id)
        link01.movementMethod = LinkMovementMethod.getInstance()

        link02=findViewById(R.id.maths02id)
        link02.movementMethod = LinkMovementMethod.getInstance()

        link03=findViewById(R.id.maths03id)
        link03.movementMethod = LinkMovementMethod.getInstance()

        link04=findViewById(R.id.programming01id)
        link04.movementMethod = LinkMovementMethod.getInstance()

        link05=findViewById(R.id.programming02id)
        link05.movementMethod = LinkMovementMethod.getInstance()

        link06=findViewById(R.id.programming03id)
        link06.movementMethod = LinkMovementMethod.getInstance()

        link07=findViewById(R.id.drawing01id)
        link07.movementMethod = LinkMovementMethod.getInstance()

        link08=findViewById(R.id.drawing02id)
        link08.movementMethod = LinkMovementMethod.getInstance()

        link09=findViewById(R.id.drawing03id)
        link09.movementMethod = LinkMovementMethod.getInstance()

        link10=findViewById(R.id.mechanics01id)
        link10.movementMethod = LinkMovementMethod.getInstance()

        link11=findViewById(R.id.mechanics02id)
        link11.movementMethod = LinkMovementMethod.getInstance()

        link12=findViewById(R.id.mechanics03id)
        link12.movementMethod = LinkMovementMethod.getInstance()


        link13=findViewById(R.id.electronics01id)
        link13.movementMethod = LinkMovementMethod.getInstance()

        link14=findViewById(R.id.electronics02id)
        link14.movementMethod = LinkMovementMethod.getInstance()

        link15=findViewById(R.id.electronics03id)
        link15.movementMethod = LinkMovementMethod.getInstance()

        link16=findViewById(R.id.electrical01id)
        link16.movementMethod = LinkMovementMethod.getInstance()

        link17=findViewById(R.id.electrical02id)
        link17.movementMethod = LinkMovementMethod.getInstance()

        link18=findViewById(R.id.electrical03id)
        link18.movementMethod = LinkMovementMethod.getInstance()

    }
}




