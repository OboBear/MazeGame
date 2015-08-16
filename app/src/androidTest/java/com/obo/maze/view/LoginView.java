package com.obo.maze.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by obo on 15/8/16.
 */
public class LoginView extends SurfaceView implements  SurfaceHolder.Callback{
    public  static String TAG = MazeView.class.getCanonicalName();
    private Context context;

    public LoginView(Context context)
    {
        super(context);
        this.context = context;
    }

    public LoginView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder){

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }


    public void showAnimation()
    {
        SurfaceHolder holder =  this.getHolder();
        Canvas canvas = holder.lockCanvas();

        canvas.drawCircle(100,100,50,new Paint());

        holder.unlockCanvasAndPost(canvas);


    }


}
