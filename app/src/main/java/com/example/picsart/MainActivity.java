package com.example.picsart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);
                    finishActivity(1);

                }
            }
        };thread.start();
    }
}