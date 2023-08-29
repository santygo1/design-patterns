package com.ds.adapter;

class Window {

    public void display(Item item){
        System.out.println(item.getContent());
    }

    public static void main(String[] args) {
        Window window = new Window();
        Item item = new Scrollbar();
        window.display(item);

        item = new OutsourceScrollbarAdapter();
        window.display(item);
    }
}
