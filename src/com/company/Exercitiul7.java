package com.company;

import java.util.ArrayList;
import java.util.List;

public class Exercitiul7 {
    public static void main(String[] args) {
        int[] V = {-3, 4, 30, -1, 0, -22, 0, 376};
        count(V, 0, 0, 0, 0);
    }

    private static void count(int[] V, int positive, int negative, int zero, int x) {
        if (x == V.length) {
            System.out.println(positive + " positive numbers");
            System.out.println(negative + " negative numbers");
            System.out.println(zero + " null numbers");
            return;
        }
        if (V[x] < 0) {
            negative++;
        } else if (V[x] > 0) {
            positive++;
        } else {
            zero++;
        }
        count(V, positive, negative, zero, x + 1);
    }
}
