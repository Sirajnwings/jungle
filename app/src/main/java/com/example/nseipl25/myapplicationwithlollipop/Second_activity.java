package com.example.nseipl25.myapplicationwithlollipop;

// import android.support.v7.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class Second_activity extends Activity {
    String ok="o",l="second";

    String ly="l";

    @Override
    protected void onStop() { super.onStop(); Log.v("Second_activity", "onStop");  }

    @Override
    protected void onDestroy() { super.onDestroy(); Log.v("Second_activity", "onDestroy"); }

    @Override
    protected void onRestart() { super.onRestart(); Log.v("Second_activity", "onRestart"); }

    @Override
    protected void onResume() { super.onResume(); Log.v("Second_activity", "onResume");}

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Second_activity", "onPause");
    }

    @Override
    protected void onStart() { super.onStart(); Log.v("Second_activity", "onStart");}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // requestWindowFeature(Window.FEATURE_ACTION_BAR);

        Log.v("Second_activity", "onCreate");

        setContentView(R.layout.activity_second_activity);
    }

}
