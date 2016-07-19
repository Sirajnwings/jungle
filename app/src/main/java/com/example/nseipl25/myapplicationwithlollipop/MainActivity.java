package com.example.nseipl25.myapplicationwithlollipop;

//import android.os.Build;
import android.app.Activity;
// import android.support.v7.app.AppCompatActivity;
// import android.app.AlertDialog;
// import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.util.Log;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.MotionEvent;
//import android.view.View;

import com.example.nseipl25.animation.RevealLayout;

public class MainActivity extends Activity {

    //AppCompatActivity

    String ju = "h",l="k";

    String kalam="ha";

    String book="demo";

     // private RevealLayout mRevealLayout;

    // private boolean mIsAnimationSlowDown = false;

    // private boolean mIsBaseOnTouchLocation = false;

    // private String temp="";

    Button btn_click;

    @Override
    protected void onStop() { super.onStop(); Log.v("MainActivity", "onStop");  }

    @Override
    protected void onDestroy() { super.onDestroy(); Log.v("MainActivity", "onDestroy"); }

    @Override
    protected void onRestart() { super.onRestart(); Log.v("MainActivity", "onRestart"); }

    @Override
    protected void onResume() { super.onResume(); Log.v("MainActivity", "onResume");}

    @Override
    protected void onPause() { super.onPause(); Log.v("MainActivity", "onPause");}

    @Override
    protected void onStart() { super.onStart(); Log.v("MainActivity", "onStart");}

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Log.v("MainActivity", "onCreate");

        btn_click = (Button)findViewById(R.id.button);

        btn_click.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //                final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
//                alertDialog.setTitle("Activity Lose Focus Go OnPause Method");
//                alertDialog.setMessage("Dialog");
//                alertDialog.setCancelable(false);
//
//                alertDialog.setButton("OK", new DialogInterface.OnClickListener()
//                {
//                    public void onClick(DialogInterface dialog, int which)
//                    {
//                        dialog.dismiss();
//
//                    }
//                });
//
//                alertDialog.show();

                Intent i = new Intent(MainActivity.this,Second_activity.class);
                startActivity(i);
            }
        });
    }

    // mRevealLayout = (RevealLayout) findViewById(R.id.reveal_layout);

    // initRevealLayout();
        //    private void initRevealLayout()
//    {
//        if (mIsBaseOnTouchLocation)
//        {
//            mRevealLayout.setOnClickListener(null);
//
//            mRevealLayout.setOnTouchListener(new View.OnTouchListener()
//            {
//                @Override
//                public boolean onTouch(View v, MotionEvent event)
//                {
//                    if (event.getActionMasked() == MotionEvent.ACTION_DOWN)
//                    {
//                          Log.d("SingleChildActivity", "x: " + event.getX() + ", y: " + event.getY());
//
//                        if (mIsAnimationSlowDown)
//                        {
//                            mRevealLayout.next((int) event.getX(), (int) event.getY(), 2000);
//                        }
//                        else
//                        {
//                            mRevealLayout.next((int) event.getX(), (int) event.getY());
//                        }
//                        return true;
//                    }
//                    return false;
//                }
//            });
//        }
//        else
//        {
//            mRevealLayout.setOnTouchListener(null);
//
//            mRevealLayout.setOnClickListener(new View.OnClickListener()
//            {
//                @Override
//                public void onClick(View v)
//                {
//                    if (mIsAnimationSlowDown)
//                    {
//                        mRevealLayout.next(2000);
//                    }
//                    else
//                    {
//                        mRevealLayout.next();
//                    }
//                }
//            });
//        }
//    }

    //    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.setting, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item)  { return super.onOptionsItemSelected(item); }

    //        if (item.getItemId() == R.id.slow)
//        {
//            item.setChecked(!item.isChecked());
//            mIsAnimationSlowDown = item.isChecked();
//            return true;
//        }
//        else if (item.getItemId() == R.id.touch)
//        {
//            item.setChecked(!item.isChecked());
//            mIsBaseOnTouchLocation = item.isChecked();
//            initRevealLayout();
//            return true;
//        }

}
