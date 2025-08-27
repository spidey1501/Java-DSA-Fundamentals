package Recurssion;

import java.util.Scanner;

public class ReverseArr {

    public void revArr(int i, int arr[], int n){
        if(i>=n/2) return;
        int temp = arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        revArr(i+1, arr, n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size n: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the arr element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        ReverseArr ob=new ReverseArr();
        ob.revArr(0, arr, n);
        System.out.println("revArr: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
}