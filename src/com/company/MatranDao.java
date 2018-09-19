package com.company;

import java.util.Scanner;

public class MatranDao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row,col;
        System.out.println("nhập số hàng =");
        row=scanner.nextInt();
        System.out.println("nhập số cột");
        col=scanner.nextInt();

        int matrix[][]=new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println("nhập giá trị [ "+i+"]"+"["+j+"]");
                matrix[i][j]=scanner.nextInt();
            }
        }
        print(matrix,matrix.length);
        System.out.println();
        for (int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                //swap(matrix[i][j],matrix[j][i]);
                int temp=matrix[i][j];
                matrix[i][j] =matrix[j][i];
                matrix[j][i] =temp;
            }
        }
        print(matrix,matrix.length);
    }

    static void swap(int index1,int index2) {
        int temp=index1;
        index1 =index2;
        index2 =temp;
    }

    static void print(int arr[][],int length) {
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
