package com.pitreskikh.moduledagger.chat;


public class Chat {

    private static ChatComponent chatComponent;

    public static ChatComponent getChatComponent() {
        return chatComponent;
    }

    public static void setChatComponent(ChatComponent chatComponent) {
        Chat.chatComponent = chatComponent;
    }
}
