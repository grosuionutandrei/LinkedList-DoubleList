package com.company;

public class Exercitiul4prim {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(rec(n,2));
    }
    public static int rec ( int n,int x){
        if(x==2*n){
            return x;
        }
        return x * rec(n,x+2);
    }
}
