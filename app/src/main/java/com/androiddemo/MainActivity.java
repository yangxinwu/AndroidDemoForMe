package com.androiddemo;

import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ClipDrawable mClipDrawable;
    private ImageView mImageView;
    private ImageView mRotateIV;
    private RotateDrawable mRotateDrawable;
    private Handler mHandler = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            /*if(msg.what == 0x123) {
                mClipDrawable.setLevel(mClipDrawable.getLevel() + 500);
            }else*/ {

                    mRotateDrawable.setLevel(mRotateDrawable.getLevel() + 300);

            }
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clip_activity);
        //one
        mImageView = (ImageView)findViewById(R.id.clip_iv);
        mClipDrawable = (ClipDrawable) mImageView.getDrawable();
        final Timer timer = new Timer();
        /*timer.schedule(new TimerTask() {
            @Override
            public void run() {
                mHandler.sendEmptyMessage(0x123);
                if (mClipDrawable.getLevel() >= 10000){
                    timer.cancel();
                }
            }
        },0,300);*/

        mRotateIV = (ImageView)findViewById(R.id.rotate_iv);
        mRotateDrawable = (RotateDrawable)mRotateIV.getDrawable();
        final Timer timer1 = new Timer();

        timer1.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                mHandler.sendEmptyMessage(0x123);
                                if (mRotateDrawable.getLevel() >= 10000){
                                    timer1.cancel();
                                }
                            }
                        },0,100
        );

    }
}
