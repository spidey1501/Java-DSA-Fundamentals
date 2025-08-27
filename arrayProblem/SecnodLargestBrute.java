import java.util.Arrays;
import java.util.Scanner;

class SecondLargestBrute
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=s.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the array element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        // int largest=arr[n-1];
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int largest=arr[n-1];
        int sLargest=0;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                sLargest=arr[i];
                break;
            }
            

        }
        System.out.println();
        System.out.println("Second Largest element is :"+ sLargest);
        s.close();
    }
}