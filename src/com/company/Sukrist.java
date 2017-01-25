package com.company;

import java.text.DecimalFormat;

/**
 * Created by andrei on 22.01.2017.
 */
public class Sukrist {
    public static void main(String[] args) {
        int counter = 1;
        int vahe=-9;

        DecimalFormat xFormat = new DecimalFormat("00");

        for (int j = 1; j < 11; j++) {
            for (int i = 9; i > -1; i--) {
                if (j%2 == 0) {
                    System.out.print(xFormat.format(counter) + " ");
                    counter++;
                } else if (j%2 == 1){
                    System.out.print(xFormat.format(counter - vahe) + " ");
                    counter++;
                    vahe = vahe + 2;
                }

            }
            vahe = -9;
            System.out.println();
        }
    }
}
