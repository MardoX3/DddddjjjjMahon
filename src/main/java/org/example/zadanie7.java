package org.example;

public class zadanie7{
    public static void main(String[] args) {
        String input = "aLdfa";
        String result = UpString(input);
        if(czyPalindrom(input) && czyPoprawnyWyraz(input)){
            System.out.println(result);
        }
        else System.out.println("nie jest palindromem");
    }

    public static String UpString(String s) {
        return s.toUpperCase();
    }
    public static boolean czyPalindrom(String wyraz) {
        String odwrocony = new StringBuilder(wyraz).reverse().toString();
        return wyraz.equals(odwrocony);
    }
    public static boolean czyPoprawnyWyraz(String wyraz) {
        return wyraz.matches("[a-z,A-Z ]*");
    }
}

