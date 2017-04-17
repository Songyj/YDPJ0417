package com.example.wangjie.Page1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wangjie.R;

public class look_evaluationActivity extends AppCompatActivity {
    private Context mContext;
    private Button  btn_toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_look_evaluation);
        btn_toast = (Button) findViewById(R.id.button_test);
        mContext = look_evaluationActivity.this;
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                midToast("正在完善，不要着急☺",Toast.LENGTH_SHORT);
            }
        });

    }
    private void midToast(String str, int showTime)
    {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.view_toast_custom,
                (ViewGroup) findViewById(R.id.lly_toast));
        ImageView img_logo = (ImageView) view.findViewById(R.id.img_logo);
        TextView tv_msg = (TextView) view.findViewById(R.id.tv_msg);
        tv_msg.setText(str);
        Toast toast = new Toast(mContext);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }

}
