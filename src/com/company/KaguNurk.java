package com.company;

/**
 * Created by andrei on 22.01.2017.
 */
public class KaguNurk {
    public static void main(String[] args){

        for (int j = 9; j > 0 ; j--) {
            for (int i = 9; i > 0 ; i--) {
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
