import java.util.Scanner;
/*
 * find the total of maximum cosecutive one in an array with 1 & 0 s
 * example input a={1,1,1,1,0,0,0,1,1,0,0,1,1}
 * output is 4 it is the max
 */
public class Consecutive1 {
    /*
     * in the below solution 
     * im intializing the count and max as 0
     * looping through the array if the the value is one then the adding the count and 
     * replacing the max with maximum among count and max 
     * if the current index value is not one then the streak broke so resting the count to 0
     * atlast retuning the max
     */
    public static int max1(int a[])
    {
        int count=0;
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            {
                count++;
                max=Math.max(max, count);
            }
            else
            {
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements as 0 and 1 only");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int op=Consecutive1.max1(a);
        System.out.println("the max consetive 1 is " +op);
        in.close();
    }
}
