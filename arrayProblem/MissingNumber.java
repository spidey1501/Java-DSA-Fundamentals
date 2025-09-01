
import java.util.Scanner;
/*find the missing number form the given 
 * example input =[0,1]
 * output=2
 * Explanation- since the n=2 the missing number is 2
 */
public class MissingNumber {
    /*in the below brute solution im itersting from 1 to n (i loop)
     * for every i Im checking the value is present in array(j loop)
     * if the value is present in it then marking the value by add the mark variable
     * then breaking the loop
     * if the mark is 0 for an i value then that is the missing number in the range
     * returning the value
     * the Time Complextiy is O(n^2) since im using nested loop
     * the Space Complexity is O(1)
     */
    public static int bruteSolution(int a[])
    {
        int n=a.length;
        for(int i=0;i<=n;i++)
        {
            int mark=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==i)
                {
                    mark++;
                    break;
                }
            }
            if(mark==0)
            {
                return i;
            }
        }
        return -1;
    }
    /*
     * in the below better solution
     * Im creating a hash array with size n+1(hashing concept)
     * why n+1?
     * if the n is 2 the range would be 0 to 2, so total 3 elements therefore Im taking n+1
     * then Im iterating through the hash array till n-1
     * and counting the element 
     * then looping through the hash array and returning the index with value 0
     * that'll be the missing number
     * the Time Complextiy is O(2n)
     * the Space Complexity is O(n) since im using extra array
     */
    public static int betterSolution(int a[])
    {
        int n=a.length;
        int hash[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            hash[a[i]]++;
        }
        for(int i=0;i<hash.length;i++)
        {
           if(hash[i]==0)
           {
            return i;
           } 
        }
        return -1;
    }
    /*
     * in the below optimal solution 
     * Im using sum of n number formula that is n(n+1)/2
     * if the n is 3 the sum would be 6
     * then add the values of array 
     * lets assume the n is 3 and mising element is 3
     * then the sum of array would be 3
     * if we found the difference between the sum of n and sum array elements 
     * we will find the missing number (6-3=3)
     * the Time Complextiy is O(n)
     * the Space Complexity is O(1)
     */
    public static int optimalSol1(int a[])
    {
        int n=a.length;
        int sum=n*(n+1)/2;
        int s2=0;
        for(int i=1;i<n;i++)
        {
            s2+=a[i];
        }
        return sum-s2;
    }
    /*
     * in the below optimal solution 
     * we are using xor 
     * in xor if we do 2^2 =0 and 0^2=2
     * if we xor 0 to n and the array elements then we will find the missing number
     * the Time Complextiy is O(n)
     * the Space Complexity is O(1)
     */
    public static int optimalSol2(int a[])
    {
        int n=a.length;
        int x1=0;
        int x2=0;
        for(int i=0;i<n;i++)
        {
            x1 =x1^a[i];
            x2=x2^i+1;
        }
        return x1^x2;
    }
        public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        // int brute=MissingNumber.bruteSolution(a);2
        // System.out.println("the missing number in the series is " +brute);
        // int better=MissingNumber.betterSolution(a);
        // System.out.println("the missing number in the series is " +better);
        // int op1=MissingNumber.optimalSol1(a);
        // System.out.println("the missing number in the series is " +op1);
        int op2=MissingNumber.optimalSol2(a);
        System.out.println("the missing number in the series is " +op2);
        in.close();
    }
}
