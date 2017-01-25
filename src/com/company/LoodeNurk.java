package com.company;

/**
 * Created by andrei on 22.01.2017.
 */
public class LoodeNurk {
    public static void main(String[] args) {
        for (int j = 1; j < 10; j++) {
            for (int i = 1; i < 10; i++) {
                if (i > j) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
