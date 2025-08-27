package Recurssion;

import java.util.Scanner;

public class sumPara {
     public void funsum(int i,int sum){
        if(i<1){
            System.out.println("Sum is");
            System.out.println(sum);
            return;
        }
        funsum(i-1,sum+i);
    }
 
    // public int funsum(int i,int sum){
    //     if(i<1){
    //         return sum;
    //     }
    //     return funsum(i-1,sum+i);
        
    // }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the n");
        int n=s.nextInt();
        sumPara ob= new sumPara();
        // int sum=ob.funsum(n, 0);
        // System.out.println(sum);
        ob.funsum(n, 0);
        s.close();
    }
}
