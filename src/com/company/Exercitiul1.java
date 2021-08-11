package com.company;

import java.util.LinkedList;
import java.util.List;

public class Exercitiul1 {
    public static void main(String[] args) {
        int[]arr={-1,23,2,-4,3};
        System.out.println(doSum(arr));
        int i = 0;
        List<Integer> pozitive = pozitive(arr);

        System.out.println(recursiveSum(pozitive,i));



    }
    private static int doSum(int[]arr){
        int sum =0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    private static int recursiveSum(List<Integer> pozitive,int x){
      if(x>=pozitive.size()-1){

          return pozitive.get(x);
      }
      return pozitive.get(x)+recursiveSum(pozitive,x+1);

    }
    private static List<Integer> pozitive(int[]arr){
        List<Integer> integers = new LinkedList<>();
        for(Integer integer: arr){
            if(integer>0){
                integers.add(integer);
            }
        }
        return  integers;
    }
}
