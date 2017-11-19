package com.pitreskikh.moduledagger.app.chat;

import com.pitreskikh.moduledagger.app.MainActivity;
import com.pitreskikh.moduledagger.chat.ChatComponent;
import com.pitreskikh.moduledagger.common.scope.ChatScope;

import dagger.Subcomponent;

@Subcomponent(modules = {AppChatModule.class})
@ChatScope
public interface AppChatComponent extends ChatComponent {


    void inject(MainActivity mainActivity);
}
