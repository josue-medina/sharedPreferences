package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleFromPrefs = resources.getString(R.string.title_text)
        val appName = resources.getString(R.string.app_name)
        val unBoolean = resources.getBoolean(R.bool.boolean_key1)
        Log.d("SAVEDVALUES", "$appName $titleFromPrefs $unBoolean")

        val texto = findViewById<TextView>(R.id.tvDefault)
        val switchONE: Switch = findViewById(R.id.switch_uno)
        val switchTWO = findViewById<Switch>(R.id.switch_dos)
        val switchTHREE = findViewById<Switch>(R.id.switch_tres)
        val switchFOUR = findViewById<Switch>(R.id.switch_cuatro)

        texto.setText(titleFromPrefs)
        switchONE.isChecked = resources.getBoolean(R.bool.boolean_key1)
        switchTWO.isChecked = resources.getBoolean(R.bool.boolean_key2)
        switchTHREE.isChecked = resources.getBoolean(R.bool.boolean_key3)
        switchFOUR.isChecked = resources.getBoolean(R.bool.boolean_key4)
























    }
}




























