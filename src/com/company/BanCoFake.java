package com.company;

import java.util.Scanner;

public class BanCoFake {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String banCo[][]= new String [8][8];

        System.out.println("nhap vào vị trí con mã");
        char indexMa = scanner.next().charAt(0);
        int numMa= scanner.nextInt();

        banCo[numMa-1][(int)indexMa-65]="mã";

        System.out.println("nhap vào vị trí con vua");
        char indexVua = scanner.next().charAt(0);
        int numVua= scanner.nextInt();

        banCo[numVua-1][(int)indexVua-65]="vua";
        //in ra bàn cờ
        for (int i=-1;i<banCo.length;i++){

            for(int j=-1;j<banCo.length;j++){
                if(j==-1&&i!=-1){
                    System.out.print("  "+(i+1));
                }
                if(i==-1&&j!=-1){
                    System.out.print("              "+(char)(65+j));
                }
                if(i>-1&&j>-1){
                    System.out.print("           "+banCo[i][j]);
                }
            }
            System.out.println();
        }
        //Kiểm tra xem vua có bị chiếu hay không!
        if((Math.abs(((int)indexMa-(int)indexVua))==1&&(Math.abs(numMa-numVua)==2))||((Math.abs(((int)indexMa-(int)indexVua))==2&&(Math.abs(numMa-numVua)==1)))){
            System.out.println("Vua bị chiếu bởi Mã");
        }else System.out.println("Vua không bị chiếu bởi Mã");

    }
}
