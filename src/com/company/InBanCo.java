package com.company;

import java.util.Scanner;

public class InBanCo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String banCo[][] = new String[8][8];
        for(int i=0;i<8;i++){

            System.out.print("     "+(char)(65+i));

        }
        System.out.println();
        for (int i=0;i<8;i++){
            System.out.print(+(i+1));

            for (int j=0;j<8;j++){

                System.out.print("  "+banCo[i][j]);
            }
            System.out.print("\t");
            System.out.println(+(i+1));
            System.out.println();
        }
        for(int i=0;i<8;i++){
            System.out.print("     "+(char)(65+i));
        }
    }

}
