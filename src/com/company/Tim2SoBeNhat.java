package com.company;
import java.util.Scanner;

public class Tim2SoBeNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai mang n= ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("nhap gia tri cua mang");
        for (int i=0;i<n;i++){
            System.out.println("arr["+i+"]= ");
            arr[i]=sc.nextInt();
        }
        int min1=arr[0];
        for (int i=1;i<n;i++){
            if (arr[i]<min1){
                min1=arr[i];
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i]==min1){
                for (int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        int min2=arr[0];
        for (int i=0;i<n-1;i++){
            System.out.println("arr["+i+"]="+arr[i]);
            if (arr[i]<min2){
                min2=arr[i];
            }
        }
        System.out.println("2 gia tri nho nhat trong mangr lan luot la "+min1+"va"+min2);
    }

}
