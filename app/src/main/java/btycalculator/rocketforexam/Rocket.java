package btycalculator.rocketforexam;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Rocket implements Drawable{
    Rocket(){
        this.x = (float)(Math.random()*400+50);
        this.y = (float)(Math.random()*200+50);
        this.vx = (float)(Math.random()*11-5);
        this.vy = (float)(Math.random()*11-5);
        this.paint = new Paint();
        this.matrix = new Matrix();
    }
    private float x, y, vx, vy;
    protected static Bitmap pic;
    protected Paint paint;
    Matrix matrix;

    static{
        pic = PicsManager.getpic(R.drawable.rocket);
    }

    protected void setVX(float vx){
        this.vx = vx;
    }

    protected void setVY(float vy){
        this.vy = vy;
    }

    protected float getX(){
        return this.x;
    }

    protected float getY(){
        return this.y;
    }
    protected float getVel(){
        return (float)Math.sqrt(vx*vx + vy*vy);
    }
    protected float getVX(){
        return this.vx;
    }

    protected float getVY(){
        return this.vy;
    }
    public void move(){
        this.x += this.vx;
        this.y += this.vy;
    }

    @Override
    public void draw(Canvas canvas){
        matrix.setScale(0.2f, 0.2f);
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        //canvas.drawBitmap(pic,matrix,paint);
    }
}
