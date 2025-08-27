// import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {

    public void unique(int arr[], int n){
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        System.out.println("The size of unique array is "+ hs.size());
        System.out.println("The unique array is (from set)");
        for(int i:hs){
            System.out.print(i +" ");
        }
        int size=hs.size();
        int uArr[]=new int[size];
        int index=0;
        Iterator<Integer> it=hs.iterator();
        while (it.hasNext()) {
            uArr[index++]=it.next();
            
        }
        System.out.println();
        System.out.println("The unique array is (from array)");
        for(int num:uArr){
            System.out.print(num+" ");
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
        RemoveDuplicate ob=new RemoveDuplicate();
        ob.unique(arr, n);
        s.close();
    }
}
