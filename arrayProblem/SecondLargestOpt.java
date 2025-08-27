import java.util.Scanner;

public class SecondLargestOpt {
    public void sLargestEle(int arr[],int n){
        int largest= arr[0];
        int sLargest=-1;
        for(int i =0; i<n;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>sLargest){
                sLargest=arr[i];
            }

        }
        System.out.println("The second largest is "+sLargest);
    }
    public void sSmallesttEle(int arr[],int n){
        int smallest= arr[0];
        int sSmallest=Integer.MAX_VALUE;
        for(int i =0; i<n;i++){
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest = arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<sSmallest){
                sSmallest=arr[i];
            }

        }
        System.out.println("The second smallest is "+sSmallest);
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
        SecondLargestOpt obj=new SecondLargestOpt();
        obj.sLargestEle(arr, n);
        obj.sSmallesttEle(arr, n);

        s.close();

    }
}
