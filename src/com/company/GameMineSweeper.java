package com.company;

public class GameMineSweeper {
    public static void main(String[] args) {
        String[][] map = {
                {"*", "."}
        };

        for (int xOrdinate = 0; xOrdinate < map[0].length; xOrdinate++) {
            if (map[0][xOrdinate].equals("*")) System.out.print("*");
            else System.out.print(1);
        }
    }
}
