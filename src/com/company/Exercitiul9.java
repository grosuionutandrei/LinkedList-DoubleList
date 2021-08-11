package com.company;

import java.util.ArrayList;
import java.util.List;

public class Exercitiul9 {
    public static void main(String[] args) {
        int[] V = {12, -4, 9, 7, -5, 31, -74, 515, -33, -8};
        int P = -10;
        int Q = 9;
        List<Integer> integerList = new ArrayList<>();
        sortInterval(V, P, Q, integerList, 0);
        System.out.println(integerList);
    }

    private static void sortInterval(int[] V, int P, int Q, List<Integer> integers, int x) {
        if (x == V.length) {
            return;
        }
        if (V[x] > P && V[x] < Q) {
            integers.add(V[x]);
        }
        sortInterval(V, P, Q, integers, x + 1);
    }
}
