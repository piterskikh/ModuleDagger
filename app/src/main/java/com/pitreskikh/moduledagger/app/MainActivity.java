package com.pitreskikh.moduledagger.app;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.pitreskikh.moduledagger.common.CommonObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.simpleText);

        textView.append(new CommonObject().getCommonText().getStr());



    }
}
