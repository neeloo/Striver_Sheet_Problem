package org.example.DP;

public class Stairs {
    public static void main(String[] args) {
        int n =3;
        System.out.println(stairs(n));

    }
    public  static  int stairs(int n){
        return stairs(n-1)+ stairs(n-2);
    }
}
