package com.company;

import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap vao so nguyen bat kỳ ");
        int num= scanner.nextInt();
        soNguyenTo(num);
        int i=2;
        while (num != 1)
        {
            if (num % i == 0)
            {
                System.out.println(i);
                num /= i;
            }

            else
                i++;
        }
    }
    public static int soNguyenTo(int soA)
    {
        if (soA < 2)
            return 0;

        for (int i = 2; i < soA; i ++)
        {
            if (soA%i==0)
            {
                return 0;
            }
        }
        return 1;
    }

}
