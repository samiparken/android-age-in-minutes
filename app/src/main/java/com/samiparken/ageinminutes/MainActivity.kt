package com.samiparken.ageinminutes

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDatePicker.setOnClickListener { view ->
            clickDatePicker(view)
            Toast.makeText(this, "Button works", Toast.LENGTH_SHORT).show()
        }

    }

    fun clickDatePicker(view: View) {

        val myCalendar = Calendar.getInstance(); //open the calendar
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener {
                view, year, month, dayOfMonth ->
                Toast.makeText(this, "Datepicker works", Toast.LENGTH_LONG).show()

            },
            year, month, day).show()
    }
}