package com.example.apple.maze;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by obo on 15/8/16.
 */
public class MazeView extends View {
    public  static String TAG = MazeView.class.getCanonicalName();
    private Context context;

    public MazeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }


}
