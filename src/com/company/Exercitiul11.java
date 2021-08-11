package com.company;

public class Exercitiul11 {
    public static void main(String[] args) {
        int[]V={-1,-2,3,2-3,-2,4,-8};
        int[]y={2,3,4};
        System.out.println(ifCorrespond(V));
        System.out.println(ifCorrespond(y));
    }
    static boolean negativ(int x){
        return x<0;
    }
    static boolean ifCorrespond(int[]V){
        for(int i = 0 ;i<=V.length-1;i+=2){
            if(negativ(V[i])){
                if(negativ(V[i+1])){
                    if(!negativ(V[i+2])){
                       return true;
                    }
                }
            }
        }
        return false;
    }

}
