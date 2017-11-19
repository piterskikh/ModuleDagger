package com.pitreskikh.moduledagger.app;


import android.app.Application;

import com.pitreskikh.moduledagger.app.chat.AppChatComponent;
import com.pitreskikh.moduledagger.app.chat.AppChatModule;
import com.pitreskikh.moduledagger.app.common.AppCommonComponent;
import com.pitreskikh.moduledagger.app.common.DaggerAppCommonComponent;
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

        AppCommonComponent appCommonComponent = DaggerAppCommonComponent.builder().build();
        AppChatComponent appChatComponent = appCommonComponent.plusAppChatComponent(new AppChatModule());
        Common.setCommonComponent(appCommonComponent);
        Chat.setChatComponent(appChatComponent);
    }
}
