package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercitiul13 {
    public static void main(String[] args) {
        System.out.println("Insert the first numbers");
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String [] first = temp.split("");
        System.out.println("Insert the second numbers");
        String temp1 = sc.nextLine();
        String [] second = temp1.split("");
        int[]firstArr=parse(first);
        int[]secondArr= parse(second);
        int count = count(firstArr,secondArr);
        List<Integer>firstList = parseToList(first);
        List<Integer>secondList = parseToList(second);
        List<Integer> thirdList = new ArrayList<>();
        System.out.println(count);
    }

    private static int[] parse(String[]V){
        int[]X = new int[V.length];
        int x = 0;
        for(String str : V){
            Integer y = Integer.parseInt(str);
            X[x]=y;
            x++;

        }
        return X;
    }
    private static List<Integer> parseToList(String[]V){
        List<Integer> integers = new ArrayList<>();
        for(String str:V){
            Integer temp = Integer.parseInt(str);
            integers.add(temp);
        }
        return integers;
    }

    public static int count(int[]V,int[]X){
        int  x = 0;
        boolean isSmalller = false;
        for(int i = 0;i<=V.length-1;i++){
            for(int j = 0;j<=X.length-1;j++){
                if(V[i]<V[j]){
                    isSmalller=true;
                    break;
                }
            }
            if(isSmalller){
                x++;
            }
        }

        return x;
    }
   public static void recursive(List<Integer>V,List<Integer>X,List<Integer>Z,int x){
        if(x==V.size()){
            return;
        }
        if(V.get(x)<X.get(x)){
            Z.add(V.get(x));
        }
        recursive(V,X,Z,x+1);
       System.out.println(Z);
   }



}
