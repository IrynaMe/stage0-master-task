package com.epam.conditions;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Triangle validator***");
        TriangleSidesValidator validator = new TriangleSidesValidator();
        double side1 = 33.0;
        double side2 = 44.0;
        double side3 = 55.0;
        validator.validate(side1, side2, side3);

        System.out.println("***Season determiner***");
        DaysInMonth dm=new DaysInMonth();
        dm.printDays(2020,4);

        System.out.println("***Integer divider***");
        IntegerDivider id=new IntegerDivider();
        id.printCompletelyDivided(10,5);
        id.printCompletelyDivided(10,6);

        System.out.println("***Coordinate***");
        CoordinatePane cp=new CoordinatePane();
        cp.printQuadrant(4,6);
        cp.printQuadrant(30,-42);
        cp.printQuadrant(-1,-8);
        cp.printQuadrant(-60,56);
        cp.printQuadrant(0,0);
        cp.printQuadrant(0,5);
        cp.printQuadrant(5,0);

        System.out.println("***Swap***");
        BitwiseValuesSwap bitwiseValuesSwap=new BitwiseValuesSwap();
        bitwiseValuesSwap.swap(5,6);

    }


}
