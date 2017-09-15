package com.fprotech.hp.myapplication.View.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fprotech.hp.myapplication.R;
import com.fprotech.hp.myapplication.View.Home.Home;

/**
 * Created by HP on 23/08/2017.
 */

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                }catch (Exception e){

                }finally {
                    Intent iHome = new Intent(Splash.this, Home.class);
                    startActivity(iHome);
                }
            }
        });

        thread.start();
    }
}
