package com.pitreskikh.moduledagger.app;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.pitreskikh.moduledagger.chat.ChatObject;
import com.pitreskikh.moduledagger.chat.ChatText;
import com.pitreskikh.moduledagger.common.CommonObject;
import com.pitreskikh.moduledagger.common.CommonText;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    CommonText commonText;

    @Inject
    ChatText chatText;

    @Inject
    AppText appText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getAppComponent().inject(this);


        TextView textView = findViewById(R.id.simpleText);

        CommonObject commonObject = new CommonObject();

        ChatObject chatObject = new ChatObject();

        textView.append(commonText.getStr());

        textView.append("\n");
        textView.append("\n");

        textView.append(chatText.getStr());

        textView.append("\n");
        textView.append("\n");

        textView.append(appText.getStr());



    }
}
