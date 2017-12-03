package btycalculator.rocketforexam;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Sky2 implements Drawable{
    Sky2(){
        this.x1 = 200f;
        this.x2 = 250f;
        this.y1 = 500f;
        this.y2 = 200f;
        this.x3 = 50f;
        this.y3 = 700f;
        this.paint = new Paint();
        this.matrix = new Matrix();
    }
    private float x1, x2, x3, y1, y2, y3;
    private Paint paint;
    private Matrix matrix;
    private static Bitmap pic1, pic2, pic3;
    static{
        pic1 = PicsManager.getpic(R.drawable.cloud);
        pic2 = PicsManager.getpic(R.drawable.cloud);
        pic3 = PicsManager.getpic(R.drawable.cloud);
    }
    @Override
    public void draw(Canvas canvas) {
        canvas.drawColor(Color.BLUE);
        matrix.setScale(0.2f, 0.2f);
        matrix.postTranslate(x1, y1);
        canvas.drawBitmap(pic1, matrix, paint);
        matrix.postTranslate(x2, y2);
        canvas.drawBitmap(pic2, matrix, paint);
        matrix.postTranslate(x3, y3);
        canvas.drawBitmap(pic3, matrix, paint);
    }
}