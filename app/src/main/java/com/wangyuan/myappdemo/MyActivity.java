package com.wangyuan.myappdemo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.wangyuan.aidl.IMyAidlInterface;
import com.wangyuan.aidl.MyService;

/**
 * Created by wangyuan on 2017/11/1.
 */

public class MyActivity extends AppCompatActivity implements View.OnClickListener{

    private IMyAidlInterface mBinder;
    private TextView mTvName;

    private ServiceConnection mConn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mBinder = IMyAidlInterface.Stub.asInterface(service);
            mTvName.setText("onServiceConnected");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            mBinder = null;
            mTvName.setText("onServiceDisconnected");
        }
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_my);
        Intent i = getIntent();
        mTvName = (TextView) findViewById(R.id.tv_name);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_bind_service:
                Intent i = new Intent(this, MyService.class);
//                i.setAction("com.wangyuan.aidl.MyService");
                bindService(i, mConn, Context.BIND_AUTO_CREATE);
                break;
            case R.id.btn_get_service:
                try {
                    if(mBinder != null) {
                        mTvName.setText("num=" + mBinder.getNumber() + "\n" + "person="+ mBinder.getPerson());
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.btn_unbind_service:
                unbindService(mConn);
                break;
            default:
                break;
        }


    }
}
