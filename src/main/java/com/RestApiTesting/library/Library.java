package com.RestApiTesting.library;

import java.util.Scanner;

public class Library {


    public void genearteTree() {
        System.out.println("Debug tree of point.");
        String data = "bintang";
        int treeHeight = 5;

        for (int i = 1; i <= treeHeight; i++) {

            for (int j = treeHeight - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars for the current level
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < treeHeight - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("Tree height: " + treeHeight);


    }


}
