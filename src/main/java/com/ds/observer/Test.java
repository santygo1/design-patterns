package com.ds.observer;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        NewsFeed feed = new NewsFeed();

        NewsReader person = (news) -> System.out.println("New news for person :" + news);
        feed.subscribeNewsReader(person);

        NewsReader dog = (news) -> System.out.println("Dog is barking");
        feed.subscribeNewsReader(dog);


        Thread thread = new Thread(() -> {
            // News
            News gameNews = new News("Game", "Game News Title", "text");
            feed.addNewNews(gameNews);
            News worldNews = new News("World", "World News Title", "text");
            feed.addNewNews(worldNews);
            News galaxyNes = new News("Galaxy", "Galaxy News Title", "text");
            feed.addNewNews(galaxyNes);
        });
        thread.start();
        thread.join();
    }
}
