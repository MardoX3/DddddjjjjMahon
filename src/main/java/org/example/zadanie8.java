package org.example;

public class zadanie8 {
    public static void main(String[] args) {
        String s = new String("RABATA");
        String k = s.toUpperCase();
        if (longestPalin(k) == "")
            System.out.println("nie jest palindromem");
        else
            System.out.println(longestPalin(k));
    }
    static boolean checkPalin(String wyraz)
    {
        String odwrocony = new StringBuilder(wyraz).reverse().toString();
        return wyraz.equals(odwrocony);
    }
    public static String longestPalin(String input) {
        String longest = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substr = input.substring(i, j);
                if (checkPalin(substr) && substr.length() > longest.length()) {
                    longest = substr;
                }
            }
        }
        return longest;
        }
    }

