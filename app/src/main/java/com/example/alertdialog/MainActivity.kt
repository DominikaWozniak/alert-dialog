package com.example.alertdialog

import android.app.AlertDialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("App background color")
            builder.setMessage("Are you want to set the app background color to RED?")
            builder.setPositiveButton("YES"){dialog, which ->
                Toast.makeText(applicationContext,"Ok, we change the app background.",Toast.LENGTH_SHORT).show()
                root_layout.setBackgroundColor(Color.RED)
            }
            builder.setNegativeButton("No"){dialog,which ->
                Toast.makeText(applicationContext,"You are not agree.",Toast.LENGTH_SHORT).show()
            }
            builder.setNeutralButton("Cancel"){_,_ ->
                Toast.makeText(applicationContext,"You cancelled the dialog.",Toast.LENGTH_SHORT).show()
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }
    }


}