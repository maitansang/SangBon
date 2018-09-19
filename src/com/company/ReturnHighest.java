package com.company;
import java.util.Scanner;
public class ReturnHighest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi");
        String string = scanner.nextLine();
        int n=string.length();
        char arr[] = new char [n];
        for(int i=0;i<n;i++){
            arr[i]=string.charAt(i);
        }
        int max=Dem(n,arr[0],arr);
        for(int i=0;i<n;i++){
            System.out.println("so lan xuat hien "+arr[i]+"la"+Dem(n,arr[i],arr));
        }
        for(int i=1;i<n;i++) {
            if (Dem(n, arr[i], arr) > max){
                max=Dem(n,arr[i],arr);
            }
        }
        System.out.println("max="+max);
        for(int j=0;j<n;j++){
            if(Dem(n,arr[j],arr)==max){
                System.out.print("chu so xuat hien nhieu nhat la\t"+arr[j]); break;
            }
        }
    }
    static int Dem(int n,char k,char arr[]) {
        int dem =0;
        for (int i=0;i<n;i++){
            if (arr[i]==k) {
                dem++;
            }
        }
        return dem;
    }
}
