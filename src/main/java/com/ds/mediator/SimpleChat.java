package com.ds.mediator;

import java.util.ArrayList;
import java.util.List;

class SimpleChat implements Chat{

    private User admin;
    private final List<User> users = new ArrayList<>();



    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user){
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        users.forEach(u -> {
            if (user != u){
                u.getMessage(message);
            }
        });
        admin.getMessage(message);
    }
}
