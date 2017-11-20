package com.pitreskikh.moduledagger.app;

import com.pitreskikh.moduledagger.chat.ChatCommonObject;
import com.pitreskikh.moduledagger.common.CommonModule;
import com.pitreskikh.moduledagger.common.CommonText;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {CommonModule.class})
public class AppModule {


    @Singleton
    @Provides
    ChatCommonObject getChatCommonObject(CommonText commonText) {
        return new ChatCommonObject(commonText);
    }

    @Singleton
    @Provides
    AppText getAppText() {
        return new AppText("Text in Application text is provided by Application");
    }


}
