package com.ds.observer;

import java.time.LocalDate;

public class News {

    private final String type;
    private final String title;
    private final String text;
    private final LocalDate createDate;

    News(String type, String title, String text) {
        this.type = type;
        this.text = text;
        this.title = title;
        this.createDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "News{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public String getType() {
        return type;
    }


    public String getTitle() {
        return title;
    }


    public String getText() {
        return text;
    }


    public LocalDate getCreateDate() {
        return createDate;
    }
}
