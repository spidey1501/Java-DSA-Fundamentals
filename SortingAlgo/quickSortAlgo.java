package SortingAlgo;

import java.util.Scanner;

public class quickSortAlgo {
    public void qSort(int arr[],int low,int high ){
        if(low<high){
            int partion=pIndex( arr, low, high);
            qSort(arr, low, partion-1);
            qSort(arr, partion+1, high);
        }
    }
    public int pIndex(int arr[], int low, int high){
        int i=low;
        int j=high;
        int pivot=arr[low];
        while(i<j)
        {
            while(arr[i]<=pivot&&i<high){
                i++;
            }
            while (arr[j]>pivot&&j>low) {
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=s.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the arr elements");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        quickSortAlgo obj=new quickSortAlgo();
        obj.qSort(arr, 0, n-1);
        System.out.println("Sorted arr elements");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        s.close();
    }
}
