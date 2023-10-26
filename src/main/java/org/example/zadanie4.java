package org.example;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] tablica = text.split(" ");
        String result = "";
        for (int i=0;i< tablica.length;i++) {
            if (!czyPalindrom(tablica[i])) {
                result="Nie";
            } else result="Tak";
        }

        System.out.println(result);
        String textGotowy = String.join(" ",tablica);
        System.out.println(textGotowy);

    }
    public static boolean czyPoprawnyWyraz(String wyraz) {
        return wyraz.matches("[a-z,A-Z ]*");
    }
    public static boolean czyPalindrom(String wyraz) {
        String odwrocony = new StringBuilder(wyraz).reverse().toString();
        return wyraz.equals(odwrocony);
    }
}
