package com.ds.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NewsFeed implements NewsArrivedObserver{

    private final List<NewsReader> subscribers;
    private final List<News> newsFeedContent;

    NewsFeed(){
        subscribers = new ArrayList<>();
        newsFeedContent = new LinkedList<>();
    }

    @Override
    public void subscribeNewsReader(NewsReader reader) {
        subscribers.add(reader);
    }

    @Override
    public void unsubscribeNewsReader(NewsReader reader) {
        subscribers.removeIf(subscriber -> subscriber.equals(reader));
    }

    @Override
    public void notifyAboutNewNews(News news) {
        subscribers.forEach(reader -> reader.onNewNewsArrived(news));
    }

    void addNewNews(News news){
        newsFeedContent.add(news);
        notifyAboutNewNews(news);
    }
}
