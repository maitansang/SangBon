package com.company;

import java.util.Random;
import java.util.Scanner;

public class maTran01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap vao so hang / cot");
        int n= scanner.nextInt();
        Matrix(n);

    }

    public static void Matrix(int row) {
        int [][] matrix= new int [row][row];
        Random rd= new Random();
        for (int i=0;i<row;i++){
            for (int j=0;j<row;j++){
                matrix[i][j]=rd.nextInt(2);
                System.out.print(+matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
