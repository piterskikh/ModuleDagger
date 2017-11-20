package com.pitreskikh.moduledagger.chat;

import com.pitreskikh.moduledagger.common.ModuleScope;

import dagger.Subcomponent;

@Subcomponent
@ModuleScope
public interface ChatComponent {
    @Subcomponent.Builder
    interface Builder {
        ChatComponent build();
    }

    void inject(ChatObject chatObject);

}
