package com.example.sharedpreferences

import android.content.Context
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

        //PARTE DE LA CLASE 09/11
        val sharedPref = getPreferences(Context.MODE_PRIVATE)
        if (sharedPref != null) {
            val success =
                sharedPref.edit().putInt(getString(R.integer.saved_high_score_key), 20).commit()

            if (success) {
                val newHighScore = sharedPref.getInt(getString(R.integer.saved_high_score_key), 21)
                Log.d("SAVEDVALUES", "AFTER BEGIN COMMITED ${newHighScore}")
            }


        }

        //otro sobreescrito
        sharedPref.edit().putString(getString(R.string.title_text), "SOBREESCRITO").commit()
        Log.d(
            "SAVEDVALUES",
            "new title ${sharedPref.getString(getString(R.string.title_text), "")}"
        )

        //
        sharedPref.edit().putString("un_string_random", "preba_de_que_pasara").commit()
        Log.d("SAVEDVALUES", "EXPERIMENTO: ${sharedPref.getString("CAMBIOS","")}")

    }
}




























