package com.androiddemo;

import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Cerie on 16/4/22.
 */
public class ActivityLevelList extends Activity {
    ImageView mImageView;
    //AnimationDrawable mAnimationDrawable;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_activity);
        mImageView = (ImageView)findViewById(R.id.animation_iv);
       // mAnimationDrawable = (AnimationDrawable)mImageView.getDrawable();
       /* Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mAnimationDrawable.start();
            }
        },100);*/

        TransitionDrawable  transitionDrawable = (TransitionDrawable)mImageView.getDrawable();
       // transitionDrawable.startTransition(1000);
        transitionDrawable.reverseTransition(1000);




    }

}
