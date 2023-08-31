package com.ds.mediator;

public class Test {
    public static void main(String[] args) {
        SimpleChat chat = new SimpleChat();


        User admin = new Admin(chat, "admin");
        User user1 = new SimpleUser(chat, "user1");
        User user2 = new SimpleUser(chat, "user2");


        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);


        admin.sendMessage("Hello, i'm admin");
    }
}
