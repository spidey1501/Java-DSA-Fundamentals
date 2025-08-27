//using rcurssion and backtracking.


package Recurssion;


import java.util.Scanner;

public class Nto1back {
    public void fun(int i,int n){
        if (i >n){
            return;
        }
        fun(i+1, n);
        // System.out.println("");
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the n :");
        int n=s.nextInt();
        System.out.println(" N to 1 using back tracikng");
        Nto1back ob= new Nto1back();
        ob.fun(1, n);
        s.close();

    }
}
