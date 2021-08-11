package com.company;

public class Exercitiul2prim {
    public static void main(String[] args) {
       int n = 7;
       int m = 4;
        System.out.println(rec(n,m));

    }
    private static int  rec( int n, int m){
      if(m==1){
          return (n-m)/m;
      }
      return  rec(n,m-1);
    }

}
