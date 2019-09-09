package com.wzk.aidlclient.kotlin

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.IBinder
import android.os.RemoteException
import com.wzk.aidlservice.IService


public class IServiceManagerKt(context: Context) {

    private lateinit var iService: IService

    private val serviceConnection = object : ServiceConnection {
        override fun onServiceConnected(componentName: ComponentName, iBinder: IBinder) {
            iService = IService.Stub.asInterface(iBinder)
            try {
                iService.setCallBack(ICallBackBinderKt())
            } catch (e: RemoteException) {
                e.printStackTrace()
            }

        }

        override fun onServiceDisconnected(componentName: ComponentName) {

        }
    }

    init {
        val intent = Intent()
        intent.setPackage("com.wzk.aidlservice")
        intent.action = "com.mskmz.service.action"
        context.bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE)
    }

    fun cmd1() {
        try {
            iService.cmd1()
        } catch (e: RemoteException) {
            e.printStackTrace()
        }

    }

    fun cmd2() {
        try {
            iService.cmd2()
        } catch (e: RemoteException) {
            e.printStackTrace()
        }

    }

    fun cmd3() {
        try {
            iService.cmd3()
        } catch (e: RemoteException) {
            e.printStackTrace()
        }

    }

    fun cmd4() {
        try {
            iService.cmd4()
        } catch (e: RemoteException) {
            e.printStackTrace()
        }

    }

    fun cmd5() {
        try {
            iService.cmd5()
        } catch (e: RemoteException) {
            e.printStackTrace()
        }

    }

    fun cmd6() {
        try {
            iService.cmd6()
        } catch (e: RemoteException) {
            e.printStackTrace()
        }

    }


}
