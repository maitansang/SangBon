package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiTuTrongMang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi");
        String string = scanner.nextLine();
        System.out.println("nhap vao ki tu");
        char index = scanner.next().charAt(0);

        char arr[]= new char [string.length()];
        for (int i=0;i<string.length();i++){
            arr[i]=string.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if (index==arr[i]){
                System.out.println("ki tu "+index+" tai vi tri "+i);
            }
        }

        for (int i=0;i<arr.length;i++){
            if(index==arr[i]){
                int dem=1;
                for(int j=0;j<i;j++){
                    if(arr[j]==' '){
                        dem++;
                    }
                }
                System.out.println("tai chu thu "+dem);
            }
        }
    }
}
