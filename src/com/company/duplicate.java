//package com.company;
//
//import java.util.Scanner;
//
//public class duplicate {
//        static int Count(char arr[], int n, char i) {
//        int count = 0;
//        for (int j = 0; j < n; j++) {
//            if (arr[j] == i) {
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap chuoi:");
//        String str = sc.nextLine();
//        int n = str.length();
//        char arr[] = new char[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = str.charAt(i);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println("so lan xuat hien cua phan tu " + arr[i] + "la " + Count(arr, n, arr[i]));
//        }
//        for(int i=0;i<n;i++){
//            if(Count(arr,n,arr[i])==1){
//                System.out.println(arr[i]);
//            }else {
//                int index str.indexOf(arr[i]);
//
//                System.out.print(arr[i]) ;
//            }
//            }
//        }
//}
