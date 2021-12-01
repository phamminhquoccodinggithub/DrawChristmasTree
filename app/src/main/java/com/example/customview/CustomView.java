package com.example.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;


public class CustomView extends View {
    private Rect rect;
    private Paint paint;
    String text = "Pham Minh Quoc - Tran Thi Cam Tu";
    public CustomView(Context context) {
        super(context);
        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    public void init(@Nullable AttributeSet set){
         rect = new Rect();
         paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //Draw body
        rect.left=450;
        rect.top=1050;
        rect.bottom= rect.top + 200;
        rect.right = rect.left + 100;
        paint.setColor(Color.BLACK);
        canvas.drawRect(rect, paint);
        //Draw Text
        paint.setTextSize(50);
        canvas.drawText(text, 10, 50, paint);
        //Draw Triangle
        Point a = new Point(500, 500);
        Point b = new Point(300, 850);
        Point c = new Point(700, 850);

        Path path = new Path();

        path.setFillType(Path.FillType.EVEN_ODD);
        path.lineTo(a.x, a.y);
        path.lineTo(b.x, b.y);
        path.lineTo(c.x, c.y);
        path.lineTo(a.x, a.y);
        paint.setColor(Color.GREEN);
        path.close();
        canvas.drawPath(path, paint);
        //Draw Triangle
        Point a1 = new Point(500, 600);
        Point b1 = new Point(300, 950);
        Point c1 = new Point(700, 950);

        path = new Path();

        path.setFillType(Path.FillType.EVEN_ODD);
        path.lineTo(a1.x, a1.y);
        path.lineTo(b1.x, b1.y);
        path.lineTo(c1.x, c1.y);
        path.lineTo(a1.x, a1.y);
        paint.setColor(Color.GREEN);
        path.close();
        canvas.drawPath(path, paint);
        //Draw Triangle
        Point a2 = new Point(500, 700);
        Point b2 = new Point(300, 1050);
        Point c2 = new Point(700, 1050);

        path = new Path();

        path.setFillType(Path.FillType.EVEN_ODD);
        path.lineTo(a2.x, a2.y);
        path.lineTo(b2.x, b2.y);
        path.lineTo(c2.x, c2.y);
        path.lineTo(a2.x, a2.y);
        paint.setColor(Color.GREEN);
        path.close();
        canvas.drawPath(path, paint);
        //Draw Circle
        paint.setColor(Color.RED);
        canvas.drawCircle(420, 700, 50, paint);
        //Draw Circle
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(570, 800, 50, paint);
        //Draw Circle
        paint.setColor(Color.RED);
        canvas.drawCircle(470, 950, 50, paint);
    }

}
