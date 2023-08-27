package com.ds.observer;

public interface NewsArrivedObserver {
    void subscribeNewsReader(NewsReader reader);
    void unsubscribeNewsReader(NewsReader reader);
    void notifyAboutNewNews(News news);
}
