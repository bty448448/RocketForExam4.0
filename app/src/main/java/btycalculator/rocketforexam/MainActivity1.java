package btycalculator.rocketforexam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity1 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        PicsManager.resourses = getResources();
    }

    public void change(View view) {
        Intent i;
        i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}
