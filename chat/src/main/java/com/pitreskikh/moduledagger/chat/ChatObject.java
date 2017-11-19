package com.pitreskikh.moduledagger.chat;


import javax.inject.Inject;

public class ChatObject {

    @Inject
    ChatText chatText;


    public ChatObject() {
        Chat.getChatComponent().inject(this);
    }

    public ChatText getChatText() {
        return chatText;
    }


}
