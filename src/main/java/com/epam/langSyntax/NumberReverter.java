package com.epam.langSyntax;

import com.epam.OOP.Animal;
import com.epam.OOP.Bird;
import com.epam.OOP.Dog;

public class NumberReverter {

    public void revert(int number) {
        if (number < 100 || number > 999) {
            System.out.println("Number not correct");
        } else {
            int n1 = number / 100;
            int n2 = (number / 10) % 10;
            int n3 = number % 10;

            int reversedNumber = n3 * 100 + n2 * 10 + n1;
            System.out.println(reversedNumber);
        }

    }
}
