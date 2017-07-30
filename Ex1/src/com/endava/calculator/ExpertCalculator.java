package com.endava.calculator;

public class ExpertCalculator  extends BasicCalculator
{
    public Long fact(int n){
        if (n == 0){
            return 1L;

        } else {
            return fact(n-1)*n;
        }
    }

}
