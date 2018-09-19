package com.company;

public class DeQuy {


    public static void doiXung(String string,int dau,int cuoi) {
        int count=0;
        if(string.length()==0||string.length()==1){
            System.out.println("doi xung");
        }else {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == string.charAt(string.length() - 1)) {
                    count++;
                }
            }
            if(count==(string.length()/2)){
                System.out.println("doi xung");
            }else System.out.println("khong doi xung");
        }
    }
}
