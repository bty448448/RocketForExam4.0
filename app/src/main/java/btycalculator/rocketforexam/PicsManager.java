package btycalculator.rocketforexam;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class PicsManager {
    private static int[] picid = new int[100];
    static Bitmap[] pic = new Bitmap[100];
    static int n = 0;
    static Resources resourses;
    static Bitmap getpic(int picid){
        for(int i = 0; i < n; i++){
            if(PicsManager.picid[i] == picid){
                return pic[i];
            }
        }
        PicsManager.picid[n] = picid;
        pic[n] = BitmapFactory.decodeResource(resourses, picid);
        return pic[n++];
    }
}
