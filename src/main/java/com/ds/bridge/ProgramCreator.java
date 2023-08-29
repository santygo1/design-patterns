package com.ds.bridge;

import java.util.Arrays;

class ProgramCreator {

    public static void main(String[] args) {
        Program[] programs = new Program[]{
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };
        Arrays.stream(programs).forEach(Program::develop);
    }
}
