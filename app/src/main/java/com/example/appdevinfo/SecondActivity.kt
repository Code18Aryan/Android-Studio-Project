package com.example.appdevinfo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val webDev = findViewById<CardView>(R.id.webDev)
        val machineLearning = findViewById<CardView>(R.id.machine)
        val ai = findViewById<CardView>(R.id.AI)
        val appDev = findViewById<CardView>(R.id.appDev)
        val web3 = findViewById<CardView>(R.id.web3)
        val blockChain = findViewById<CardView>(R.id.blockchain)

        val contact = findViewById<Button>(R.id.button2)

        webDev.setOnClickListener{

             intent = Intent(applicationContext, SecondWeb::class.java)

             startActivity(intent)
        }

        machineLearning.setOnClickListener{

            intent = Intent(applicationContext, SecondMachine::class.java)
            startActivity(intent)
        }

        ai.setOnClickListener{

            intent = Intent(applicationContext, SecondAi::class.java)
            startActivity(intent)
        }

        appDev.setOnClickListener{

            intent = Intent(applicationContext, SecondAppDev::class.java)
            startActivity(intent)
        }

        web3.setOnClickListener{

            intent = Intent(applicationContext, SecondWeb3::class.java)
            startActivity(intent)
        }

        blockChain.setOnClickListener{

            intent = Intent(applicationContext, SecondBlockchain::class.java)
            startActivity(intent)
        }

        contact.setOnClickListener {

            val intent = Intent(Intent.ACTION_DIAL)

            intent.data = Uri.parse("8709064804")

            startActivity(intent)

        }






    }
}