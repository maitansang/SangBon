package com.company;

import java.util.Scanner;

public class XapSepTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        System.out.println("nhap vao so phan tu cua mang 1");
        n= scanner.nextInt();
        System.out.println("nhap vap sp phan tu cua mang 2");
        m= scanner.nextInt();
        int arr1[] = new int [n];
        int arr2[] = new int [m];
        int arr3[] = new int [n+m];

        for (int i=0;i<n;i++){
            System.out.println("nhap phan tu thu"+i);
            arr1[i]= scanner.nextInt();
        }

        for (int i=0;i<m;i++){
            System.out.println("nhap phan tu thu"+i);
            arr2[i]= scanner.nextInt();
        }

        for (int i=0;i<(n+m);i++){
            if(i<n) System.out.println(arr1[i]);
            else System.out.println(arr2[i-n]);
        }
    }

    public static void xapSep(String[] args) {
        System.out.println("nhap vao so phan tu");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int [n];
        for (int i=0;i<n;i++){
            System.out.println("nhap phan tu thu"+i);
            arr[i]= scanner.nextInt();
        }

        int max= arr[0];

        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("so lan nhat la"+max);
    }
}
