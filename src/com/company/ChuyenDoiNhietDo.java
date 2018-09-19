package com.company;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao nhiet do F");
        float fah= scanner.nextFloat();
        Math.floor(changeTemp(fah*10)/10);
        System.out.println(+fah+"do F = "+changeTemp(fah)+"do C");
    }

    static double changeTemp(float fahrenheit ) {
        return  (5.0 / 9) * (fahrenheit - 32);
    }
}
