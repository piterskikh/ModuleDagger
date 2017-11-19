package com.pitreskikh.moduledagger.chat;


import com.pitreskikh.moduledagger.common.CommonText;

import javax.inject.Inject;

public class ChatObject {

    @Inject
    ChatText chatText;

    @Inject
    ChatCommonObject chatCommonObject;


    @Inject
    CommonText commonText;


    public ChatObject() {
        Chat.getChatComponent().inject(this);
    }

    public ChatText getChatText() {
        return chatText;
    }

    public ChatCommonObject getChatCommonObject() {
        return chatCommonObject;
    }
}
