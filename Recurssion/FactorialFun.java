package Recurssion;

import java.util.Scanner;

public class FactorialFun {
     public int funFact(int i){
        if(i==0){
            return 1;
        }
        return i*funFact(i-1);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the n");
        int n=s.nextInt();
        FactorialFun ob= new FactorialFun();
        System.out.println("Factorial of "+ n);
        System.out.println(ob.funFact(n));
        s.close();
    }
    
}
