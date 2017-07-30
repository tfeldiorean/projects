package com.endava.calculator;

public class BasicCalculator implements Calculator {

    @Override
    public long add(Integer a, Integer b, Integer... list) {
        Integer c = a + b;
        for (Integer i : list) {

            c += i;
        }
        return c.longValue();
    }

    @Override
    public long add(Long a, Long b) {
        return 0;
    }

    @Override
    public double add(Double a, Double b) {
        return 0;
    }

    @Override
    public long substract(Integer a, Integer b) {
        return 0;
    }

    @Override
    public long substract(Long a, Long b) {
        return 0;
    }

    @Override
    public double substract(Double a, Double b) {
        return 0;
    }
}
