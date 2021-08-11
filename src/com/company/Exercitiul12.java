package com.company;

import java.util.*;

public class Exercitiul12 {
    public static void main(String[] args) {
        int[] V = {1, 5, 2, 1, 5, 7, 2, 1, 5};
        Map<Integer, Integer> mjj = appearances(V);
        System.out.println(mjj);
        int[] V1 = generateArray(V);
        Arrays.stream(V1).forEach(e-> System.out.print( +e + ","));

    }

    private static Map<Integer, Integer> appearances(int[] V) {
        Map<Integer, Integer> appearances = new HashMap<>();
        Set<Integer> iValue = new HashSet<>();
        int temp;
        int c;
        for (int i = 0; i <= V.length - 1; i++) {
            temp = V[i];
            c = 0;
            if (iValue.contains(V[i])) {
                continue;
            }
            for (int j = 0; j <= V.length - 1; j++) {
                if (V[i] == V[j]) {
                    c++;
                }
            }
            appearances.put(V[i], c);
            iValue.add(V[i]);
        }
        return appearances;
    }

    private static int[] generateArray(int[] V) {
        int[] V1 = new int[V.length];
        for (int i = 0; i <= V.length - 1; i++) {
            if (appearances(V).keySet().contains(V[i])) {
                V1[i] = appearances(V).get(V[i]);
            }
        }
        return V1;
    }


}



