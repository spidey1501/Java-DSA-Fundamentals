import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Find the longest Sub-array whic equals the sub array
// input -[1,2,3,5,1,4,2] K=6
//output - 3
// longest sub-array that adds to k is 3 ie 1,2,3[length is 3]
public class longestSubarrayWithSumK {
    public static int LongestSubArrayBS1(int []a,long K){
        // bruteFroceSolution1
        //the time complexity is ~O(n^3) cuz it consists loop with 2 inner loops
        // and the space complexity is O(1)// no additional space is used 
        int len=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
               int sum=0;
               for(int k=i;k<=j;k++){
                sum+=a[k];
               } 
               if(sum==K)
               {
                len=Math.max(len,j-i+1);
               }
            }
        }
        return len;
    }
    //bruteSolution With optimised time complexity
    //the time complexity is ~O(n^2) cuz it consist loop with one inner loop, where the k loop in the previous solution removed 
    // and the space complexity is O(1)// no additional space is used 
    public static int LongestSubArrayBS2(int a[],long K)
    {
        int len=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
            sum+=a[j];
            if(sum==K)
               {
                len=Math.max(len,j-i+1);
               }
            }
        }
        return len;
    }
    //better solution
    //here we are map to store the prefix of each elements with the index and if the sum == k we are calculating the len
    //here the solution has only one loop then the time complexity is ~O(n)
    //and we are unsing hash map were the space comlexity will be ~O(n)
    public static int betterSolutionUsingMap(int a[], long K)
    {
        Map<Long, Integer> prefixSum= new HashMap<>();
        int maxLen=0;
        long sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(sum==K)
            {
                maxLen=Math.max(maxLen, i+1);
            }
            long rem=sum-K;
            if(prefixSum.containsKey(rem))
            {
                int len=i-prefixSum.get(rem);
                maxLen=Math.max(maxLen, len);
            }
            if(!prefixSum.containsKey(sum))
            {
                prefixSum.put(sum,i);
            }
        }
        return maxLen;
    }
    //optimal Solution
    //below is the optimal solution for the this problem but it only works for postive values
    //the time ciomplexity is ~O(2n), where the inner while loop only runs for some cases
    // no extra space is used therefore the space complexity is O(n)
    public static int optimalSolution(int a[], long K)
    {
        int length=0;
        int right=0, left=0;
        int sum=0;
        while (right<a.length) 
        {
            sum+=a[right];
            while(left<=right&& sum>K)
            {
                sum-=a[left];
                left++;
            }
            if(sum==K){
                length=Math.max(length, right-left+1);
            }
            right++;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the k value");
        long k=in.nextLong();
        // int result=longestSubarrayWithSumK.LongestSubArrayBS1(a, k);
        // System.out.println("the longest sub-array equals "+k+" is: "+result);

        // int result3=longestSubarrayWithSumK.betterSolutionUsingMap(a, k);
        // System.out.println("The length of the longest subarray is: " + result3);

        int result4=longestSubarrayWithSumK.optimalSolution(a, k);
        System.out.println("The length of the longest subarray is: " + result4);
        in.close();
    }
}
