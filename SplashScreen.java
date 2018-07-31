package com.example.android.growpet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Launch the layout -> splash.xml
        setContentView(R.layout.splash_screen);
        Thread splashThread = new Thread() {

            public void run() {
                try {
                    // sleep time in milliseconds (3000 = 3sec)
                    sleep(3000);
                }  catch(InterruptedException e) {
                    // Trace the error
                    e.printStackTrace();
                } finally
                {
                    // Launch the MainActivity class
                    Intent intent = new Intent(SplashScreen.this, CreatePetGuide.class);
                    startActivity(intent);
                }

            }
        };
        // To Start the thread
        splashThread.start();
    }


}
