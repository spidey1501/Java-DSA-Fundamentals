import java.util.Scanner;

public class ScenondLargestBetter 
{
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=s.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the array element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int largest= arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]>largest)
            largest = arr[i];
        }
        int sLargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>sLargest&&arr[i]!=largest){
                sLargest=arr[i];
            }
        }
        System.out.println("Second Largest element is:" +sLargest);


        s.close();
    
    }    
}
