package com.androiddemo;

import android.app.Activity;
import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Cerie on 16/4/22.
 */
public class AnimationActivity extends Activity {
    ImageView mImageView;
    LevelListDrawable levelListDrawable;


    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            if (msg.what == 0x123) {
                if (levelListDrawable.getLevel() > 10000) levelListDrawable.setLevel(0);
                mImageView.setImageLevel(levelListDrawable.getLevel() + 2000);
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_activity);
        mImageView = (ImageView) findViewById(R.id.animation_iv);
        levelListDrawable = (LevelListDrawable) mImageView.getDrawable();
        mImageView.setImageLevel(0);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        }, 0, 100);


    }

}
