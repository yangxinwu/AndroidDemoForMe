package com.androiddemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Cerie on 16/4/21.
 */
public class MyView extends View {
    Paint mPaint;

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private  void init(){

        mPaint = new Paint();
        mPaint.setTextSize(13);
        mPaint.setAntiAlias(true);
        mPaint.setAlpha(10);
        mPaint.setARGB(10, 10, 10, 10);
        mPaint.setStrokeWidth(3);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(getResources().getColor(R.color.colorAccent));

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(700,500,250,mPaint);
        canvas.drawLine(0,0,500,1000,mPaint);
        canvas.drawRect(0,0,200,200,mPaint);
    }
}
