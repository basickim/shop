package com.shop.algorithm;

public class answer {

    static int max4(int a, int b, int c, int d)
    {
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(d>max){
            max=d;
        }
        return d;
    }

    static int min3(int a, int b, int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }



    public static void main(String[] args) {
        System.out.println(max4(1,2,3,4));
        System.out.println(min3(1,2,3));
    }
}
