package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercitiul5 {
    public static void main(String[] args) {
        int[] V = {2, 4, 6, 25, 3, 66};
        List<Integer> integers = new ArrayList<>();
        checkPerfectSquare(V, integers, 0);
        System.out.println(integers);


    }

    private static void checkPerfectSquare(int[] V, List<Integer> integers) {
        for (int i = 0; i <= V.length - 1; i++) {
            for (int j = 2; j <= V[i] / 2; j++) {
                if (j * j == V[i]) {
                    integers.add(V[i]);
                }
            }
        }
    }

    private static boolean isPerfectSquare(int x) {
        boolean isPerfect = false;
        for (int i = 2; i <= x / 2; i++) {
            if (i * i == x) {
                isPerfect = true;
            }
        }
        return isPerfect;
    }

    private static void checkPerfectSquare(int[] V, List<Integer> integers, int x) {
        if (x == V.length - 1) {
            return;
        }
        if (isPerfectSquare(V[x])) {
            integers.add(V[x]);
        }
        checkPerfectSquare(V, integers, x + 1);
    }
}
