package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CreateFile {
    public static void main(String[] args) throws IOException {
//        File file = new File ("OUTPUT.txt");
//        try(PrintWriter pw= new PrintWriter(file)){
//            pw.println("Hello world");
//            pw.println("welcome to my tutorial");
//        }
//        catch(Exception e){
//
//        }
        File file =new File("FirstFileTest.txt");
        file.createNewFile();
        System.out.println("duong dan tuyet doi cua file "+file.getAbsolutePath());
        System.out.println("kich thuoc file:"+file.length());
        System.out.println("last nodify date"+ new Date( file.lastModified() ));
        System.out.println("file co the doc "+file.canRead());
        File file1 = new File ("");
    }
}
