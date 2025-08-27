// import java.util.Arrays;
import java.util.Scanner;

public class LargestOptimal {
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
        for (int i=1;i<n;i++){
            if (arr[i]>largest)
            largest = arr[i];
        }
        System.out.println("The largest element is: "+ largest);
        s.close();
    
    }
}
