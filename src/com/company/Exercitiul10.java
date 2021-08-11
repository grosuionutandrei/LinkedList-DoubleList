package com.company;

public class Exercitiul10 {
    public static void main(String[] args) {
        double[]V = {-2,13,34.75,125,3.5,8,61};
        System.out.println(doSum(V,0));
        System.out.println(doAverage(V));
        print(V,0,0,0);




    }
    private static  double doSum(double[]V,int x){
        if(x==V.length-1){
           return V[x];
        }
        return V[x] + doSum(V,x+1);
    }
    private static double doAverage(double[]V){
        return (doSum(V,0))/V.length;
    }
    private static void print(double[]V,int x,double y ,double z){

        if(x==V.length){
            System.out.println(getProcent(x,y) + "% smaller numbers");
            System.out.println(getProcent(x,z) + "% bigger numbers");
            return;
        }
        if(V[x]<doAverage(V)){
            y=y+1;
        }else if(V[x]>doAverage(V)){
            z=z+1;
        }
        print(V,x+1,y,z);
    }
    private static double getProcent(int x,double y){
        return (y*100)/x;
    }

}
