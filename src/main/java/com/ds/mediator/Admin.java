package com.ds.mediator;

class Admin implements User {

    Chat chat;
    String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving msg : " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
