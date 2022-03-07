package com.company;

public class jungsuk0404 {    // 1+(-2)+3+(-4)+5+... 몇까지 더해야 총합이 100이상이 되는지?
    public static void main(String[] args) {
        int s = 1;
        int sum = 0;
        int num = 0;
        for(int i=1; sum<100; i++, s=-s) {
            num = i*s;
            sum+=num;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}



//다시 해볼 것