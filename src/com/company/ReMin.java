package com.company;
import java.util.Arrays;
public class ReMin {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,8,0,10};
        System.out.println(Arrays.toString(a));
        System.out.println(reMin(a,a.length));
        int b=1;
    }

    public static int reMin(int a[],int n) {
        int min = a[0];
        for (int i=0;i<n;i++){
           if(a[i]<min){
               min=a[i];
           }
        }
        return min;
    }
}
