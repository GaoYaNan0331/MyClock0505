package com.example.administrator.sizeutils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * data:2017/5/5
 * author:高亚男(Administrator)
 * function:
 */

public class CustomCompoundView extends LinearLayout {

    private ImageView iv;
    private TextView tv;

    public CustomCompoundView(Context context) {
        this(context, null);
    }

    public CustomCompoundView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        // 导入布局
        LayoutInflater mInflater = LayoutInflater.from(context);
        mInflater.inflate(R.layout.customview, this, true);	//注意此次最后一个参数为 true
        iv = (ImageView) findViewById(R.id.iv);
        tv = (TextView) findViewById(R.id.tv);

    }

    /**
     * 设置图片资源
     */
    public void setImageResource(int resId) {
        iv.setImageResource(resId);
    }

    /**
     * 设置显示的文字
     */
    public void setTextViewText(String text) {
        tv.setText(text);
    }

}
