package com.wzk.aidlclient.kotlin

import android.os.RemoteException
import android.util.Log
import com.wzk.aidlclient.ICallBack
import com.wzk.aidlclient.constance.CmdConstance


class ICallBackBinderKt : ICallBack.Stub() {
    companion object {
        //---------------DEBUG配置-------------------------------------------------------
        private const val TAG = "ICallBackBinder"
        private const val DEBUG = true
    }

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

}
