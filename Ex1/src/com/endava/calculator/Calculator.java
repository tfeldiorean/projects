package com.endava.calculator;

public interface Calculator {

public long add (Integer a, Integer b, Integer... list);
public long add (Long a, Long b);
public double add(Double a, Double b);

public long substract (Integer a, Integer b);
public long substract (Long a, Long b);
public double substract(Double a, Double b);
}
