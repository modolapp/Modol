package com.hfad.modol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNotification(View view) {
        Intent intent = new Intent(this, Notification.class);
        startActivity(intent);
    }

    public void onNews(View view) {
        Intent intent = new Intent(this, News.class);
        startActivity(intent);
    }
}
