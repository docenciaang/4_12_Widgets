package com.example.a4_12_widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.Calendar.MONDAY

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivPrimera.setOnClickListener{
            Toast.makeText(this, "Una imagen",Toast.LENGTH_SHORT).show()
        }

        //===========  calendario
        cvCalendario.firstDayOfWeek = MONDAY

        cvCalendario.setOnDateChangeListener{ view, anno, mes,dia ->
            Toast.makeText(this, "marcado año= $anno , mes=$mes, dia=$dia",Toast.LENGTH_SHORT).show()
        }
    }
}
