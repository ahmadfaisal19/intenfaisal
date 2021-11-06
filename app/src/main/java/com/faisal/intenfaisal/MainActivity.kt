package com.faisal.intenfaisal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.math.log
import android.util.Log.i as i1

class MainActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnMoveActivity: Button
    private lateinit var btnMoveWithData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveActivity = findViewById(R.id.btn_movr_activity)
        btnMoveActivity.setOnClickListener(this)

        btnMoveWithData = findViewById(R.id.btn_movr_with_data)
        btnMoveWithData.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if(v != null){
            when(v.id){
                R.id.btn_movr_activity -> run {
                    val intent = Intent(this, MoveActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn_movr_with_data -> run {
                    val intent = Intent(this, MoveWithDataActivity::class.java)
                    val bundle = Bundle()
                    bundle.putString("Nama" , "Faisal")
                    bundle.putString("Alamat" , "Stimata")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }
    }

}