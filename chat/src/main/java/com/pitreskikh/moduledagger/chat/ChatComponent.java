package com.pitreskikh.moduledagger.chat;

import com.pitreskikh.moduledagger.common.scope.ChatScope;

import dagger.Subcomponent;

@Subcomponent
@ChatScope
public interface ChatComponent {

    void inject(ChatObject chatObject);

}
