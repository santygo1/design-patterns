package com.ds.templatemethod;

class Test {

    public static void main(String[] args) {
        Page main = new WelcomePage();
        Page news = new NewsPage();

        main.display();
        System.out.println("===========================");
        news.display();
    }
}
