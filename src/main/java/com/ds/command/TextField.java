package com.ds.command;

class TextField {

    private String name;

    public TextField(String name) {
        this.name = name;
    }

    String open(){
        return String.format("TextField %s is opened!", name);
    }

    String save(){
        return String.format("TextField %s is saved!", name);
    }


}
