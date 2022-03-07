package com.company;

public class Main { //  1+ (1+2)+ (1+2+3)+ ... +(1+2+3+ ... +9+10)=?
    public static void main(String[] args) {
        int sum= 0;
        int sumtotal = 0;

        for(int i=0; i<=10; i++) {
            sum += i;
            sumtotal +=sum;
        }
        System.out.println(sumtotal);
    }
}
