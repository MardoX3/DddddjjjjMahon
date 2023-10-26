package org.example;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i <= 9999; i++){

            int n = i;
            int sum = 0, r;
            int temp = n;
            while(n>0)
            {
                r = n % 10;
                sum = (sum*10)+r;
                n = n/10;
            }
            if(temp==sum){
                System.out.println(temp+" jest palindromem ");
            }

        }
        int n = in.nextInt();
        int sum = 0, r;
        int temp = n;
        while(n>0)
        {
            r = n % 10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a palindrome");
    }
}

