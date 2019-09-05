package com.wzk.aidlclient;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

import com.wzk.aidlservice.IService;

public class IServiceManager {

    IService iService;

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            iService = IService.Stub.asInterface(iBinder);
            try {
                iService.setCallBack(new ICallBackBinder());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };

    public IServiceManager(Context context) {
        Intent intent = new Intent();
        intent.setPackage("com.wzk.aidlservice");
        intent.setAction("com.mskmz.service.action");
        context.bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    public void cmd1() {
        try {
            iService.cmd1();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void cmd2() {
        try {
            iService.cmd2();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void cmd3() {
        try {
            iService.cmd3();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void cmd4() {
        try {
            iService.cmd4();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void cmd5() {
        try {
            iService.cmd5();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void cmd6() {
        try {
            iService.cmd6();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }


}

