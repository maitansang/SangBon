package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int [] diemHocSinh= new int[10];
//        Scanner scanner = new Scanner(System.in);
//        for(int i=0;i<diemHocSinh.length;i++){
//            System.out.println("nhap phan tu thu:"+i);
//            diemHocSinh[i]= scanner.nextInt();
//        }
//        //for each;
//        for(int diemHocSinhMoi: diemHocSinh){
//            System.out.println(diemHocSinhMoi);
//            // tham trị là diemHocSinh;
//            diemHocSinhMoi=0;
//            System.out.println(diemHocSinhMoi);
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap so luong sinh vien");
//        int n = scanner.nextInt();
//        String arr1[]= new String [n];
//        for(int i=0;i<arr1.length;i++){
//        System.out.println("nhap vao ten sinh vien thu"+i);
//        arr1[i] = scanner.nextLine();
//
//        }
//        System.out.println("nhap vao ten sv");
//        String tenSv = scanner.nextLine();
//        boolean kTra = true;
//        for (int i=0;i<arr1.length;i++){
//            if(arr1[i]==tenSv){
//                kTra= true;
//            }else kTra=false;
//        }
//        if(kTra==true) System.out.println("có giá trị "+ tenSv);
//        else System.out.println("khong có giá trị "+tenSv);
//    }
//}


            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap do dai mang: ");
            int x = scanner.nextInt();
            scanner.nextLine();
            String[] arr = new String[x];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Nhap gia tri thu " + i);
                arr[i] = scanner.nextLine();
            }

            System.out.println(Arrays.toString(arr));
        System.out.println("nhap vao tem ban tim kiem");
        String name = scanner.nextLine();
        for(int i=0;i<arr.length;i++){
            if (name.equals(arr[i])==true){
                System.out.println("sinh vien ban tim co trong danh sach");
            }else System.out.println("sinh vien ban tim khong co trong danh sach");
        }
        }
    }