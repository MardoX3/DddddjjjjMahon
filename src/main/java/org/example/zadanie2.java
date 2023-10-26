package org.example;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź napis:");
        String text = scanner.nextLine();
       isLowerCaseLatin(text);



    }

    public static void isLowerCaseLatin (String text) {
            if (text.matches("[a-z,A-Z ]*")) {
                String[] words2 = text.split(" ");
                System.out.println(words2.length);
            }
            else System.out.println("zawiera polskie znaki");
        }
    }


