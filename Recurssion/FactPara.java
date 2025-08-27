package Recurssion;

import java.util.Scanner;

public class FactPara {
    public void funFact(int i,int fact){
        if(i<1){
            System.out.println("Factorial is");
            System.out.println(fact);
            return;
        }
        funFact(i-1,fact*i);
    }
 
    // public int funFact(int i,int fact){
    //     if(i<1){
    //         return fact;
    //     }
    //     return funFact(i-1,fact+i);
        
    // }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the n");
        int n=s.nextInt();
        FactPara ob= new FactPara();
        ob.funFact(n, 1);
        // System.out.println(sum);
        s.close();
    }
}
