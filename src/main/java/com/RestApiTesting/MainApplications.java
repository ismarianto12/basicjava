package com.RestApiTesting;

import com.RestApiTesting.library.Library;

import java.util.Scanner;

public class MainApplications {

    public void TestingGetScanner(String[] args) {
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        try {
            System.out.println(s.nextInt());
            System.out.println(s.nextInt());
            System.out.println(s.next());
            System.out.println(s.next());
        } catch (Exception e) {
            System.err.println("Error while reading input: " + e.getMessage());
        } finally {
            s.close();
        }
    }


    public static void main(String[] args) {
        try {
            MainApplications mainApp = new MainApplications();
            Library library = new Library();
            library.genearteTree();
            mainApp.TestingGetScanner(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
