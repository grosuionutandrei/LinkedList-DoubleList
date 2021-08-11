package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercitiul6 {
    public static void main(String[] args) {
        int[] V = {-1, 2, -3, 5, 9, -12, 89, 67, -21, -45};
        List<Integer> integers = new ArrayList<>();
        getPositiveNumbers(V, integers, 0);
        System.out.println(integers);
    }

    private static void getPositiveNumbers(int[] V, List<Integer> integers, int x) {
        if (x == V.length - 1) {
            return;
        }
        if (V[x] > 0) {
            integers.add(V[x]);
        }
        getPositiveNumbers(V, integers, x + 1);
    }

}
