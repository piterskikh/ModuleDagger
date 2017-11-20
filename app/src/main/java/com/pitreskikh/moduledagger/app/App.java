package com.pitreskikh.moduledagger.app;


import android.app.Application;


import com.pitreskikh.moduledagger.chat.Chat;
import com.pitreskikh.moduledagger.common.Common;


public class App extends Application {

    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    public static void setAppComponent(AppComponent appComponent) {
        App.appComponent = appComponent;
    }

    @Override
    public void onCreate() {

        super.onCreate();

        appComponent = DaggerAppComponent.builder().build();
        Common.setCommonComponent(appComponent.plusCommonComponent());
        Chat.setChatComponent(appComponent.plusChatComponent());
    }
}
