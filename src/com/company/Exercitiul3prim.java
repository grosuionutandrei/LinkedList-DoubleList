package com.company;

import java.util.Scanner;

public class Exercitiul3prim {
    public static void main(String[] args) {
        System.out.println("insert the number");
        Scanner sc =new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println(fDeN(c));

    }
    public static int fDeN(int n){

        if(n==1){
           return 0;
        }
        if(n==2){
           return n * n ;
        }
        return n*n + fDeN(n-1);
    }
}
