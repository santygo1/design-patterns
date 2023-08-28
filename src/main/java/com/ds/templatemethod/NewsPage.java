package com.ds.templatemethod;

class NewsPage extends Page {


    @Override
    void showPageContent() {
        System.out.println("This is news page");
    }

    @Override
    void afterPageContentHook() {
        System.out.println("With hook");
    }
}
