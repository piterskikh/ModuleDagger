package com.pitreskikh.moduledagger.app;

import com.pitreskikh.moduledagger.chat.ChatComponent;
import com.pitreskikh.moduledagger.chat.ChatModule;
import com.pitreskikh.moduledagger.common.CommonComponent;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class, ChatModule.class})
@Singleton
public interface AppComponent {
    CommonComponent plusCommonComponent();
    ChatComponent plusChatComponent();


    void inject(MainActivity mainActivity);
}
