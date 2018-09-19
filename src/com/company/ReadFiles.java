package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFiles {
    public static void hienThi(String dirPath) throws IOException {
        File file = new File (dirPath);
        File [] files = file.listFiles();
        System.out.println("noi dung thu muc "+dirPath);
        for(File file1: file.listFiles()){
            System.out.println(file1.getCanonicalPath());
        }
    }

    public static void main(String[] args) throws IOException {
        hienThi("C:\\Users\\DELL\\Desktop");
    }
}
