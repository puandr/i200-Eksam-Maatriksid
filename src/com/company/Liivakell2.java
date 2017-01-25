package com.company;

import java.util.Arrays;

/**
 * Created by andrei on 24.01.2017.
 */
public class Liivakell2 {
    public static void main(String[] args) {
        String [][] maatriks = new String[9][9];

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks[i].length; j++) {
                if (i + j <= 8 && i - j <= 0) {
                    maatriks[i][j] = "0";
                } else if (i + j >= 8 && i - j >= 0) {
                    maatriks[i][j] = "0";
                } else {
                    maatriks[i][j] = " ";
                }
            }
            System.out.println(Arrays.toString(maatriks[i]));
        }
    }
}
