import java.util.Scanner;
/*
 * 
 * input a={1,1,2,2,3,4,4,5,5}
 */
public class AppearOnce {
    /*
     *In the solution below, we loop from 0 to n-1 (outer loop).
     *For each element a[i], we compare it with all other elements a[j] (inner loop). 
     *If a[j] equals a[i], we increment the count.
     *After the inner loop finishes, if the count is equal to 1, we return that element because it appears only once in the array.
     */
    public static int bruteSol(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==a[i]){
                    count++;
                }
            }
            if(count==1)
            return a[i];
        }
        return -1;
    }
        /*
        * In the solution below, we apply XOR to all elements of the array.
        * Since a number XORed with itself is 0 (e.g., 2 ^ 2 = 0),
        * and any number XORed with 0 is the number itself (e.g., 0 ^ 2 = 2),
        * all numbers that appear twice will cancel out to 0.
        * Therefore, the element that appears only once will remain as the result.
        */
    public static int op1(int a[])
    {
        int x1=0;
        for(int i=0;i<a.length;i++){
            x1=x1^a[i];
        }
        return x1;
    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int brute=AppearOnce.bruteSol(a);
        System.out.println("the number appear once in array "+brute);
        int optimal=AppearOnce.op1(a);
        System.out.println("the number appear once in array "+optimal);
        in.close();
    }
}
