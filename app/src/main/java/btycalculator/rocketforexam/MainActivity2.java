package btycalculator.rocketforexam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        PicsManager.resourses = getResources();

    }

    public void change(View view) {
        Intent i;
        i = new Intent(this, MainActivity1.class);
        startActivity(i);
    }


}