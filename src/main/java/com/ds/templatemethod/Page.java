package com.ds.templatemethod;

abstract class Page {

    public final void display() {
        System.out.println("Header");

        showPageContent();
        afterPageContentHook();

        System.out.println("Footer");
    }

    void afterPageContentHook() {
        System.out.println("Without hook");
    }

    abstract void showPageContent();
}
