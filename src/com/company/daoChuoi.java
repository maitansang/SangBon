
package com.company;



import java.util.Scanner;

public class daoChuoi {
    public static void main(String[] args) {
        String string = "toi la mai tan sang ";
        int array[]= new int[string.length()];
        for(int i=0;i<string.length();i++){
             array[i]=string.charAt(i);
        }
        int viTri = 0;
        for (int i=viTri;i<string.length();i++){
            if(array[i]==' ') {
                for(int j=i;j>=viTri;j--) {
                    System.out.print((char) array[j]);
                }
                viTri=i+1;
            }
        }
    }
}







