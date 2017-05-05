package com.baway.myfristclock0505;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WatchBoard w = (WatchBoard) findViewById(R.id.watch);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        w.setOnClickListener(new WatchBoard.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,DetailActivity.class));
            }
        });
//        w.setOnViewClick(new WatchBoard.onViewClick() {
//            @Override
//            public void onClick(float scrollX, float scrollY) {
//                startActivity(new Intent(MainActivity.this,DetailActivity.class));
//            }
//        });
    }
}
