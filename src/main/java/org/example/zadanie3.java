package org.example;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] tablica = text.split(" ");
        for (int i=0;i< tablica.length;i++) {
            tablica[i] = tablica[i].substring(0, 1).toUpperCase() + tablica[i].substring(1).toLowerCase();
        }
        String textGotowy = String.join(" ",tablica);
        System.out.println(textGotowy);

    }

    public static boolean czyPoprawnyWyraz(String wyraz) {
        return wyraz.matches("[a-z,A-Z ]*");
    }
}



