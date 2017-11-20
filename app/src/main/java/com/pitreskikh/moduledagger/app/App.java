package com.pitreskikh.moduledagger.app;


import android.app.Application;


import com.pitreskikh.moduledagger.chat.Chat;
import com.pitreskikh.moduledagger.common.Common;


public class App extends Application {

    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {

        super.onCreate();

        appComponent = DaggerAppComponent
                .builder()
                .chatText("Text in Chat text is provided by Application")
                .commonText("Text in Common text is provided by Application")
                .build();

        Common.setCommonComponent(appComponent.commonComponentBuilder().build());
        Chat.setChatComponent(appComponent.chatComponentBuilder().build());
    }
}
