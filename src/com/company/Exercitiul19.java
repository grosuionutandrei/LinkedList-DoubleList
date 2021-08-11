package com.company;

public class Exercitiul19 {
    public static void main(String[] args) {
        int x = 132;
        int y = reverseNumber(x, 0);
        if (isPalindrome(x, y)) {
            System.out.println(x + " == " + y + " is palindrome");
        } else {
            System.out.println(y + " " + "!= " + x + " is not palindrome");
        }
        ;


    }

    private static int reverseNumber(int x, int y) {
        int i = x % 10;
        if (x == 0) {
            return y;
        }
        y = (y * 10) + i;
        return reverseNumber(x / 10, y);
    }

    private static boolean isPalindrome(int x, int y) {
        return x == y;
    }

}
