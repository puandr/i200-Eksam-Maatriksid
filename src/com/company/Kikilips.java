package com.company;
/*
* Näide
         0 . . . . . . . 0
         0 0 . . . . . 0 0
         0 0 0 . . . 0 0 0
         0 0 0 0 . 0 0 0 0
         0 0 0 0 0 0 0 0 0
         0 0 0 0 . 0 0 0 0
         0 0 0 . . . 0 0 0
         0 0 . . . . . 0 0
         0 . . . . . . . 0
*/
public class Kikilips {
    public static void main(String[] args) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }

        String[][] ajutineMassiiv = new String[9][9];

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if ((col <= row) && ((col + row) < 9)) {
                    ajutineMassiiv[row][col] = "0";
                } else if ((row < 4) && ((row + col) >= 8)) {
                    ajutineMassiiv[row][col] = "0";
                } else if ((row >= 4) && (col >= row)) {
                    ajutineMassiiv[row][col] = "0";
                } else {
                    ajutineMassiiv[row][col] = ".";
                }

            }
            System.out.println();
        }

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                System.out.print(ajutineMassiiv[j][i]);
            }
            System.out.println();
        }
    }
}
