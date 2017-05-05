package com.example.administrator.sizeutils;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * data:2017/5/5
 * author:高亚男(Administrator)
 * function:
 */

public class CustomSearchView extends LinearLayout {
    private EditText et_input;
    private ImageButton ib_check;
    private EditTextChangedListener mListener;

    public void setmListener(EditTextChangedListener mListener) {
        this.mListener = mListener;
    }

    public CustomSearchView(Context context) {
        super(context);
        init(context);
    }

    public CustomSearchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {

        // 导入布局
        LayoutInflater mInflater = LayoutInflater.from(context);
        View view = mInflater.inflate(R.layout.search_view, this, false);

        this.et_input = (EditText) view.findViewById(R.id.et_input);
        this.ib_check = (ImageButton) view.findViewById(R.id.ib_check);

        // 添加按钮点击事件
        this.ib_check.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                et_input.setText("");// 设置输入框内容为空
            }
        });

        this.et_input.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s!=null && s.length()>0){

                    ib_check.setVisibility(View.VISIBLE);

                    if(mListener!=null){
                        mListener.toggleSearch(s.toString());
                    }

                }else{
                    ib_check.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });

        addView(view);
    }

    public interface EditTextChangedListener {

        public void toggleSearch(String input);
    }
}

