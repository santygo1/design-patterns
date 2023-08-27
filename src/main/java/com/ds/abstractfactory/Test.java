package com.ds.abstractfactory;

public class Test {
    public static void main(String[] args) {
        GuiFactory guiFactory = createGuiFactory("Windows");
        System.out.println(guiFactory.createScrollbar().getClass().getName());
        System.out.println(guiFactory.createButton().getClass().getName());


        GuiFactory guiFactory2 = createGuiFactory("MacOS");
        System.out.println(guiFactory2.createScrollbar().getClass().getName());
        System.out.println(guiFactory2.createButton().getClass().getName());
    }


    static GuiFactory createGuiFactory(String os){
        return switch (os.toLowerCase()) {
            case "windows" -> new WindowsGuiFactory();
            case "macos" -> new MacosGuiFactory();
            default -> null;
        };
    }
}
