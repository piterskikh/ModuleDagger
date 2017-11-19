package com.pitreskikh.moduledagger.app.chat;

import com.pitreskikh.moduledagger.app.AppText;
import com.pitreskikh.moduledagger.chat.ChatCommonObject;
import com.pitreskikh.moduledagger.chat.ChatText;
import com.pitreskikh.moduledagger.common.CommonText;
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

    @ChatScope
    @Provides
    ChatCommonObject getChatCommonObject(CommonText commonText) {

        return new ChatCommonObject(commonText);
    }

    @ChatScope
    @Provides
    AppText getAppText() {

        return new AppText("Text in Application text is provided by Application");
    }
}
