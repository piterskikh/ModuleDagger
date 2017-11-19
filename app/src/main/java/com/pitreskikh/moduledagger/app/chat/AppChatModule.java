package com.pitreskikh.moduledagger.app.chat;

import com.pitreskikh.moduledagger.chat.ChatText;
import com.pitreskikh.moduledagger.common.scope.ChatScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppChatModule {

    @ChatScope
    @Provides
    ChatText getChatText() {

        return new ChatText("Text in chat text is provided by Application");
    }
}
