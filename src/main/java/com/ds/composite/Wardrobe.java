package com.ds.composite;

import java.util.ArrayList;
import java.util.List;

class Wardrobe implements Item{

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }

    @Override
    public String getTitle() {
        return "Wardrobe";
    }

    @Override
    public int getWidth() {
        return 150;
    }

    @Override
    public int getHeight() {
        return 240;
    }

    @Override
    public int getWeight() {
        return items.stream().mapToInt(Item::getWeight).sum();
    }

    public List<Item> getComponents(){
        return items;
    }
}
