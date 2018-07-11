package com.example.ram.demo_niharika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class demo_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_splash);

        Thread t = new Thread() {
            public void run() {
                try {
                    Thread.currentThread().sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally
                {
                    // Thread.currentThread().stop();
                    finish();
                    Intent it=new Intent(demo_splash.this,MainActivity.class);
                    startActivity(it);

                }

            }
        };
        t.start();
    }
}
