package com.example.appprojfinal;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    private int CurrentProgress = 0;
    private ProgressBar progressBar;

    private CircleView circleView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





       /* circleView = findViewById(R.id.circleloader);
        circleView.setAnimDuration(1000);
        circleView.setLoaderColor(getResources().getColor(R.color.colorAccent));
        circleView.setStrokeWidth(20);


        CountDownTimer countDownTimer = new CountDownTimer(11*1000,1000) {
            @Override
            public void onTick(long l) {

                CurrentProgress = CurrentProgress +10;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);
            }

            @Override
            public void onFinish() {

            }
        };*/

    }
}