package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        if (number < 100 || number > 9999) {
            System.out.println("Number not correct");
        } else {
            int n1 = number / 1000;
            int n2 = (number / 100) % 10;
            int n3 = (number / 10) % 10;
            int n4 = number % 10;
            int sum = n1 + n2 + n3 + n4;
            System.out.println(sum);
        }
    }

}
