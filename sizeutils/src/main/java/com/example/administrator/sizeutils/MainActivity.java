package com.example.administrator.sizeutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CustomCompoundView ib1;
    private CustomCompoundView ib2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
}

        private void findView() {

        ib1 = (CustomCompoundView) findViewById(R.id.bt_co);
        ib2 = (CustomCompoundView) findViewById(R.id.bt_ca);

        ib1.setTextViewText("首页");
        ib1.setImageResource(R.mipmap.btn_home_hover);
        ib2.setTextViewText("收藏");
        ib2.setImageResource(R.mipmap.btn_soucang_hover);
    }

}
