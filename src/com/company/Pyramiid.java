package com.company;

/**
 *  0 0 0 0 0 0 0 0 0
 *  0 1 1 1 1 1 1 1 0
 *  0 1 2 2 2 2 2 1 0
 *  0 1 2 3 3 3 2 1 0
 *  0 1 2 3 4 3 2 1 0
 *  0 1 2 3 3 3 2 1 0
 *  0 1 2 2 2 2 2 1 0
 *  0 1 1 1 1 1 1 1 0
 *  0 0 0 0 0 0 0 0 0
 */
public class Pyramiid {
    public static void main(String[] args) {
        int[][] massiiv = new int[9][9];

        for (int row = 0; row < 9; row++) {
            int lisaLoendur = 1;
            for (int col = 0; col < 9; col++) {
                if ((col + row ) < 9) {
                    if ((col > row)) {
                        massiiv[row][col] = row;
                    } else {
                        massiiv[row][col] = col;
                    }
                } else {
                    massiiv[row][col] = massiiv[row-lisaLoendur][row];
                    lisaLoendur++;
                }

            }
            System.out.println();
        }

        /* rea je veeru indeksite väljaprint
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                System.out.print(j + "" + i + " ");
            }
            System.out.println();
        }
        */

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                System.out.print(massiiv[j][i] + " ");
            }
            System.out.println();
        }
    }
}

