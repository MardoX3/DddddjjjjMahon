package org.example;
import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadź napis:");
            String text = scanner.nextLine();
            if (isLowerCaseLatin(text)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }

        public static boolean isLowerCaseLatin (String text){
            for (int i = 0; text.length() > i; i++) {
                if (text.charAt(i) < 97 || text.charAt(i) > 122) {
                    return false;
                }
            }
            return true;
        }
    }

