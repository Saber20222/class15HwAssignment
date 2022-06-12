package com.syntax.class15;

public class BigNumber {
    // create a program that can give me inside parameter to print which number is the biggest number'

    void printlargernumber(int num1, int num2){
        int larger=0;
        if(num1>num2){
           larger=num1;

        }else if (num2>num1){
            larger=num2;

        }else{
            larger=num1;
        }

    }

    public static void main(String[] args) {
        BigNumber bignumber=new BigNumber();
        bignumber.printlargernumber(12,12);

    }

}
