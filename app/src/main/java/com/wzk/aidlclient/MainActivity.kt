package com.wzk.aidlclient

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.wzk.aidlclient.constance.CmdConstance
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


    private lateinit var service: IServiceManager;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        service = IServiceManager(this)
        btn_cmd_1.setOnClickListener(this)
        btn_cmd_2.setOnClickListener(this)
        btn_cmd_3.setOnClickListener(this)
        btn_cmd_4.setOnClickListener(this)
        btn_cmd_5.setOnClickListener(this)
        btn_cmd_6.setOnClickListener(this)
    }

    fun resolve(cmd: Int) {
        when (cmd) {
            CmdConstance.CMD_1 -> Log.d(LogConfig.TAG, "CMD_1")
            CmdConstance.CMD_2 -> Log.d(LogConfig.TAG, "CMD_2")
            CmdConstance.CMD_3 -> Log.d(LogConfig.TAG, "CMD_3")
            CmdConstance.CMD_4 -> Log.d(LogConfig.TAG, "CMD_4")
            CmdConstance.CMD_5 -> Log.d(LogConfig.TAG, "CMD_5")
            CmdConstance.CMD_6 -> Log.d(LogConfig.TAG, "CMD_6")
        }
    }


}
