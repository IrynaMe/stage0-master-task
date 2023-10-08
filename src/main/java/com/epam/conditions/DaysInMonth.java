package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else {
            switch (month) {
                case 2:
                   // System.out.println(isLeapYear ? 29 : 28);
                    if(isLeapYear) System.out.println(29);
                    else {
                        System.out.println(28);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
                    break;
                default:
                    System.out.println(31);
                    break;
            }
        }
    }
}