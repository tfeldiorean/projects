package com.endava.test;

import com.endava.calculator.BasicCalculator;
import com.endava.calculator.Calculator;
import com.endava.calculator.ExpertCalculator;

public class test {
    public static void main(String... args) {
        Calculator calculator = new BasicCalculator();
        ExpertCalculator expertCalculator = new ExpertCalculator();
        System.out.println("Sum of 4 plus 5 plus 9 plus 4 is: " + calculator.add(4, 5, 9, 4));
        System.out.println("3 factorial is: " + expertCalculator.fact(3));
    }
}
