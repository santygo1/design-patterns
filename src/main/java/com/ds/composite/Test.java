package com.ds.composite;

import java.util.LinkedList;
import java.util.List;

class Test {

    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();

        Board board = new Board();
        wardrobe.addItem(board);
        Board board1 = new Board();
        wardrobe.addItem(board1);
        Board board2 = new Board();
        wardrobe.addItem(board2);

        Shelf shelf = new Shelf();
        wardrobe.addItem(shelf);
        Shelf shelf1 = new Shelf();
        wardrobe.addItem(shelf1);


        List<Item> info = new LinkedList<>();
        info.add(wardrobe);
        info.addAll(wardrobe.getComponents());
        info.forEach(Item::display);
    }


}
