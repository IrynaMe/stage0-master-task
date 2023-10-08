package com.epam.loops;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Multiplication table***");
        MultiplicationTable mt=new MultiplicationTable();
        mt.printTable(8);
        mt.printTable(0);
        mt.printTable(-3);
        mt.printTable(24);
    }
}
