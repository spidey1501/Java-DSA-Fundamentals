package Recurssion;

import java.util.Scanner;

public class OnetoNBack {
     public void fun(int i,int n){
        if (i <1){
            return;
        }
        fun(i-1, n);
        // System.out.println("");
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the n :");
        int n=s.nextInt();
        System.out.println(" 1 to N using back tracikng");
        OnetoNBack ob= new OnetoNBack();
        ob.fun(n, n);
        s.close();

    }
}
