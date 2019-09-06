package com.wzk.aidlclient

import android.os.RemoteException
import android.util.Log
import com.wzk.aidlclient.constance.CmdConstance


class ICallBackBinderKt : ICallBack.Stub() {

    @Throws(RemoteException::class)
    override fun onCallBack(cmd: Int) {
        if (DEBUG) Log.d(TAG, "Client: $cmd")
        when (cmd) {
            CmdConstance.CMD_1 -> Log.d(TAG, "CMD_1")
            CmdConstance.CMD_2 -> Log.d(TAG, "CMD_2")
            CmdConstance.CMD_3 -> Log.d(TAG, "CMD_3")
            CmdConstance.CMD_4 -> Log.d(TAG, "CMD_4")
            CmdConstance.CMD_5 -> Log.d(TAG, "CMD_5")
            CmdConstance.CMD_6 -> Log.d(TAG, "CMD_6")
        }
    }

    companion object {
        //---------------DEBUG配置-------------------------------------------------------
        private val TAG = "ICallBackBinder"
        private val DEBUG = true
    }
}
