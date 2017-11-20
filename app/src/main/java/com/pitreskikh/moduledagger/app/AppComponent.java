package com.pitreskikh.moduledagger.app;

import com.pitreskikh.moduledagger.chat.ChatComponent;
import com.pitreskikh.moduledagger.chat.ChatModule;
import com.pitreskikh.moduledagger.common.CommonComponent;
import com.pitreskikh.moduledagger.common.Second;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {AppModule.class, ChatModule.class})
@Singleton
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder chatText(String chatText);

        @BindsInstance
        Builder commonText(@Named("name") String commonText);

        AppComponent build();
    }


    CommonComponent.Builder commonComponentBuilder();

    ChatComponent.Builder chatComponentBuilder();


    void inject(MainActivity mainActivity);
}
