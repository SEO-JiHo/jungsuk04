package com.company;

public class jungsuk0402 {

    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<21; ++i) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    } //  4-2 정답


}
