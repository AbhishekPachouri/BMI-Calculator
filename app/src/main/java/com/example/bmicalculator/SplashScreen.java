package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;


public class SplashScreen extends SplashScreen2 {
    Handler handler;
    ProgressBar progressBar;
    int count=0;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);

      progressBar=findViewById(R.id.progress_bar);
      timer=new Timer();
      TimerTask timerTask=new TimerTask() {
          @Override
          public void run() {

          }
      };
      {
          count++;
          progressBar.setProgress(count);
          if (count==100){
              timer.cancel();
          }
        };
      timer.schedule(timerTask,0,100);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this,SplashScreen2.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}