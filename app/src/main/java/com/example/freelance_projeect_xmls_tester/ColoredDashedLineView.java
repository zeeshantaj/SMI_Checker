package com.example.freelance_projeect_xmls_tester;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
public class ColoredDashedLineView  extends View {
    private Paint paint;
    private int[] colors = {Color.RED, Color.GREEN, Color.BLUE}; // Add more colors as needed
    private float[] dash = {10, 20}; // Modify the dash pattern if needed
    private float dashOffset = 0;

    public ColoredDashedLineView(Context context) {
        super(context);
        init();
    }

    public ColoredDashedLineView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ColoredDashedLineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4); // Modify stroke width if needed
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float startY = 50; // Starting Y coordinate for the dashed line
        float space = 20; // Space between dashes

        // Draw multiple dashed lines with different colors
        for (int i = 0; i < colors.length; i++) {
            paint.setPathEffect(new DashPathEffect(dash, dashOffset));
            paint.setColor(colors[i]);
            canvas.drawLine(0, startY, getWidth(), startY, paint);
            startY += space; // Adjust vertical spacing
        }
    }
}
