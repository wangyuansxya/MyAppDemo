package com.wangyuan.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.wangyuan.bean.Person;

/**
 * Created by wangyuan on 2017/11/1.
 */

public class MyService extends Service {

    private IMyAidlInterface.Stub mBinder = new IMyAidlInterface.Stub() {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public int getNumber() throws RemoteException {
            return 2017;
        }

        @Override
        public Person getPerson() throws RemoteException {
            Person p = new Person();
            p.id = 1;
            p.age = 2018;
            p.name = "john";
            p.sex = "man";
            return p;
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("MyService", "onCreate");
    }

    /*@Override
    public int onStartCommand(Intent intent, @IntDef(value = {Service.START_FLAG_REDELIVERY, Service.START_FLAG_RETRY}, flag = true) int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }*/
}
