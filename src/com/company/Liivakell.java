package com.company;
/**
 * Loo 9*9 maatriks, millel on kujutatud liivakella. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 0 0 0 0 0 0 0 0
 * . 0 0 0 0 0 0 0 .
 * . . 0 0 0 0 0 . .
 * . . . 0 0 0 . . .
 * . . . . 0 . . . .
 * . . . 0 0 0 . . .
 * . . 0 0 0 0 0 . .
 * . 0 0 0 0 0 0 0 .
 * 0 0 0 0 0 0 0 0 0
 *
 */
public class Liivakell {
    public static void main(String[] args) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }

        System.out.println();



        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (row + col < 9 && row - col <= 0) {
                    System.out.print("0 ");
                } else if (row + col >= 8 && row - col >= 0) {
                    System.out.print("0 ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
