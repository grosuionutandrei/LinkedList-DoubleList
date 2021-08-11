package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul8 {
    public static void main(String[] args) {
        System.out.println("Insert the numbers, comma separated: ");
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String[] tempo = temp.split(",");
        Integer[] integers = new Integer[tempo.length];
        convert(tempo,integers);
        findIndex(integers,0);
    }
    private static void convert(String[] strings,Integer[]integers){
     for(int i = 0;i<=strings.length-1;i++){
         integers[i]=Integer.parseInt(strings[i]);
     }
    }
    private static void findIndex(Integer[]integers,int x){
        if(integers[x]>0){
            System.out.println("The index of first positive number is  " + (x+1) );
            return;
        }
        findIndex(integers,x+1);
    }
}
