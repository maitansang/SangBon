package com.company;

public class Recursion {
    public static void main(String[] args) {
        //System.out.println("fibonaci cua 5 la"+fibonaci(5));
        for (int i=0;i<10;i++){
            System.out.println("fibonaci("+i+")="+fibonaci(i));
        }
    }
    public static long giaiThua(int n){
        if (n==0){
            return 1;
        }
        return n*fibonaci(n-1);
    }

    public static long fibonaci(int n) {
        if (n<3){
            return 1;
        }
        return fibonaci(n-1)+fibonaci(n-2);
    }
}
