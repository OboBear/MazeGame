package com.example.apple.maze;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.example.apple.maze.MazeView;

/**
 * Created by obo on 15/8/16.
 */
public class LoginView extends View{
    public  static String TAG = MazeView.class.getCanonicalName();
    private Context context;



    public LoginView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
    }



}
