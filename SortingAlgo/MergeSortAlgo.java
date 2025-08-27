package SortingAlgo;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortAlgo {
    public void mergeSort(int arr[], int low, int high){
        if(low>=high)return;
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    /**
     * @param arr
     * @param low
     * @param mid
     * @param high
     */
    public void merge(int arr[], int low,int mid, int high){
        ArrayList <Integer> temp=new ArrayList();
        int left=low;
        int right=mid+1;
        while (left<=mid && right<=high) {
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
            
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
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
        MergeSortAlgo obj=new MergeSortAlgo();
        obj.mergeSort(arr, 0, n-1);
        System.out.println("Sorted arr elements");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        s.close();
    }

}
