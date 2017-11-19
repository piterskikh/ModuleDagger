package com.pitreskikh.moduledagger.chat;

import com.pitreskikh.moduledagger.common.scope.ChatScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ChatModule {

    @ChatScope
    @Provides
    public ChatText chatText() {
        return null;
    }


}
