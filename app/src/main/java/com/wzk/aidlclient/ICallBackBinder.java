package com.wzk.aidlclient;

import android.os.RemoteException;
import android.util.Log;

import com.wzk.aidlclient.constance.CmdConstance;

public class ICallBackBinder extends com.wzk.aidlservice.ICallBack.Stub {

    //---------------DEBUG配置-------------------------------------------------------
    private static final String TAG = "ICallBackBinder";
    private static final boolean DEBUG = true;

    @Override
    public void onCallBack(int cmd) throws RemoteException {
        if (DEBUG) Log.d(TAG, "Client: " + cmd);
        switch (cmd) {
            case CmdConstance.CMD_1:
                Log.d(TAG, "CMD_1");
                break;
            case CmdConstance.CMD_2:
                Log.d(TAG, "CMD_2");
                break;
            case CmdConstance.CMD_3:
                Log.d(TAG, "CMD_3");
                break;
            case CmdConstance.CMD_4:
                Log.d(TAG, "CMD_4");
                break;
            case CmdConstance.CMD_5:
                Log.d(TAG, "CMD_5");
                break;
            case CmdConstance.CMD_6:
                Log.d(TAG, "CMD_6");
                break;
        }
    }
}
