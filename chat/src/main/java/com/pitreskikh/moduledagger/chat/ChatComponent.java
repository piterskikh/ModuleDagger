package com.pitreskikh.moduledagger.chat;

import com.pitreskikh.moduledagger.common.scope.ChatScope;

import dagger.Component;

@Component(modules = {ChatModule.class})
@ChatScope
public interface ChatComponent {

    void inject(ChatObject chatObject);

}
