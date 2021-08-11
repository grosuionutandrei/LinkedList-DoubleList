package com.company;

import java.util.ArrayList;
import java.util.List;

public class Exercitiul3 {
    public static void main(String[] args) {
        int[] V = {-2, 4, 15, 3, 6, 13};
        List<Integer> integerList = new ArrayList<>();
        getEven(V, integerList, 0);
        System.out.println(integerList);


    }

    private static void getEven(int[] V, List<Integer> integers, int x) {
        if (x == V.length - 1) {
            return;
        }
        if (V[x] % 2 == 0) {
            integers.add(V[x]);
        }
        getEven(V, integers, x + 1);

    }
}
