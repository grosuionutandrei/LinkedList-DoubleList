package com.company;

import java.util.LinkedList;
import java.util.List;

public class Exercitiul4 {
    public static void main(String[] args) {
        int[] V = {2, -3, -1, 43, 3, 2, -4, 8, 12};
        List<Integer> integers = new LinkedList<>();
        if (V[0] > 0) {
            integers.add(V[0]);
        }
        getPositiveAtOddIndex(V, integers, 1);
        System.out.println(integers);


    }

    private static void getPositiveAtOddIndex(int[] V, List<Integer> integers, int x) {

        if (x == V.length) {
            return;
        }
        if (V[x] > 0 && (x % 2 == 0)) {
            integers.add(V[x]);
        }
        getPositiveAtOddIndex(V, integers, x + 1);
    }


}
