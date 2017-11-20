package com.pitreskikh.moduledagger.chat;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ChatModule {

    @Singleton
    @Provides
    ChatText getChatText(String chatText) {
        return new ChatText(chatText);
    }

}
