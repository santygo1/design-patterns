package com.ds.adapter;

public class OutsourceScrollbarAdapter extends OutsourceScrollbar implements Item{
    @Override
    public String getContent() {
        return this.logic();
    }
}
