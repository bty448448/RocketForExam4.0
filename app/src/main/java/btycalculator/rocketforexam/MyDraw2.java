package btycalculator.rocketforexam;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class MyDraw2 extends View {

    ArrayList objects = new ArrayList();

    public MyDraw2(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();
        this.rocket = new ControlRocket();
        this.sky = new Sky2();
        objects.add(sky);
        objects.add(rocket);

    }

    private Paint paint;
    private ControlRocket rocket;
    private Sky2 sky;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        for(Object obj : objects){
            if(obj instanceof Touchable){
                ((Touchable) obj).touch(event.getX(), event.getY());
            }
        }
        return super.onTouchEvent(event);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        for(Object obj : objects){
            if(obj instanceof Drawable) {
                ((Drawable) obj).draw(canvas);
            }
        }
        rocket.move();
        invalidate();
    }


}