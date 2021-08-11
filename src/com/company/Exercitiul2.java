package com.company;

import java.util.ArrayList;
import java.util.List;

public class Exercitiul2 {
    public static void main(String[] args) {
        int V[] = {-2, 4, 15, 3, 6, 13};
        List<Integer> integers = new ArrayList<>();
        getEven(V, 0, integers);
        System.out.println(integers);
        doAverage(integers);
    }

    private static void getEven(int[] V, int x, List<Integer> integers) {
        if (x == V.length - 1) {
            return;
        }
        if (V[x] % 2 == 0) {
            integers.add(V[x]);
        }
        getEven(V, x + 1, integers);
    }

    private static void doAverage(List<Integer> integers) {
        float i = 0;
        float sum = 0;
        float avg = 0;
        for (Integer integer : integers) {
            sum = sum + integer;
            i++;
        }
        avg = sum / i;
        System.out.println(avg);
    }
}
