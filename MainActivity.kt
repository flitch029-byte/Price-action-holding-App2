package com.example.botcontrol

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val status = findViewById<TextView>(R.id.status)
        val log = findViewById<TextView>(R.id.log)
        val symbol = findViewById<EditText>(R.id.symbol)
        val lot = findViewById<EditText>(R.id.lot)
        val target = findViewById<EditText>(R.id.target)
        val trailing = findViewById<EditText>(R.id.trailing)

        findViewById<Button>(R.id.start).setOnClickListener {
            status.text = "Status: RUNNING"
            log.text =
                "Bot started\n" +
                "Symbol: ${symbol.text}\n" +
                "Lot: ${lot.text}\n" +
                "Daily target: $${target.text}\n" +
                "Trailing stop: ${trailing.text} points\n\n" +
                "Next step: connect this control panel to the MT5 EA/API."
        }

        findViewById<Button>(R.id.stop).setOnClickListener {
            status.text = "Status: STOPPED"
            log.text = "Bot stopped."
        }
    }
}
