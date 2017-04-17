package com.example.wangjie.Page3.UI;

import com.example.wangjie.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;



@SuppressLint("DrawAllocation")
public class BorderTextView extends TextView {

    public BorderTextView(Context context) {
        super(context);
    }
    public BorderTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    private int sroke_width = 1;
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        //  将边框设为黑色
        //int color = ContextCompat.getColor(context, R.color.lightgray);
        paint.setColor(getResources().getColor(R.color.lightgray));
        //  画TextView的4个边
        canvas.drawLine(20, 0, this.getWidth() - sroke_width, 0, paint);
        //canvas.drawLine(0, 0, 0, this.getHeight() - sroke_width, paint);
        //canvas.drawLine(this.getWidth() - sroke_width, 0, this.getWidth() - sroke_width, this.getHeight() - sroke_width, paint);
        //canvas.drawLine(0, this.getHeight() - sroke_width, this.getWidth() - sroke_width, this.getHeight() - sroke_width, paint);
        super.onDraw(canvas);
    }
}
