package org.example;

import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź a:");
        long a = scanner.nextLong();
        System.out.println("Wprowadź b:");
        long b = scanner.nextLong();
        if(a >= 0 && a <= b && b < 10000000000L){
            int palindromeCount = countPalindromicNumbers(a, b);
            System.out.println("Liczba liczb palindromicznych w przedziale [" + a + "; " + b + "]: " + palindromeCount);
        }
        else{
            System.out.println("warunek sie nie zgadza");
        }
    }
    public static int countPalindromicNumbers(long a, long b) {
        int count = 0;
        for (long i = a; i <= b; i++) {
            if (checkPalin(String.valueOf(i))) {
                count++;
            }
        }
        return count;
    }

    static boolean checkPalin(String wyraz)
    {
        String odwrocony = new StringBuilder(wyraz).reverse().toString();
        return wyraz.equals(odwrocony);
    }
}
