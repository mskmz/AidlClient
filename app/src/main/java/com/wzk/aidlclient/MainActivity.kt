package com.wzk.aidlclient

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        when (p0) {
            btn_cmd_1 -> service.cmd1()
            btn_cmd_2 -> service.cmd2()
            btn_cmd_3 -> service.cmd3()
            btn_cmd_4 -> service.cmd4()
            btn_cmd_5 -> service.cmd5()
            btn_cmd_6 -> service.cmd6()
        }
    }
    //---------------DEBUG配置-------------------------------------------------------

    object LogConfig {
        val TAG = "MainActivity"
        val DEBUG = true
    }


    private lateinit var service: IServiceManagerKt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        service = IServiceManagerKt(this)
        btn_cmd_1.setOnClickListener(this)
        btn_cmd_2.setOnClickListener(this)
        btn_cmd_3.setOnClickListener(this)
        btn_cmd_4.setOnClickListener(this)
        btn_cmd_5.setOnClickListener(this)
        btn_cmd_6.setOnClickListener(this)
    }


}
