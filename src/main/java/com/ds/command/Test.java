package com.ds.command;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        TextField tf1 = new TextField("file1.txt");
        TextField tf2 = new TextField("file2.txt");

        List<TextFileOperation> operations = new LinkedList<>();
        operations.add(new OpenTextFieldOperation(tf2));
        operations.add(new OpenTextFieldOperation(tf1));
        operations.add(new SaveTextFieldOperation(tf2));
        operations.add(new SaveTextFieldOperation(tf1));

        operations.forEach((op) -> System.out.println(op.execute()));

    }
}
