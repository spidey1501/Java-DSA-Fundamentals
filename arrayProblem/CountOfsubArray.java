import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfsubArray {
    public static int subarraySum(int[] nums, int k) {
        int count=0;
        // BRUTE and OPTIMAL for positive is explained in longestSubArray problem
        // brute
        //  for (int i=0;i<nums.length;i++){
        //      int sum=0;
        //      for(int j=i;j<nums.length;j++){
        //          sum +=nums[j];
        //          if(sum==k){
        //              count++;
        //          }
        //      }
        //  }
        // return count;
        ////////////////////////////////////////////////////////////////////////
        //optimal only for positive
        // int right=0, left=0;
        // int sum=0;
        // while(right<nums.length)
        // {
        //     sum+=nums[right];
        //     while(left<right && sum>k)
        //     {
        //         sum-=nums[left];
        //         left++;
        //     }
        //     if(sum==k)
        //     {
        //         count++;
        //     }
        //     right++;
        // }
        // return count;

        //Optimal Solution
        //in this we are using map so the space complexity is ~O(n)
        // the time complexity is ~O(n) cuz of a single loop
        //we are using prefix sum, commputing sum while iterating
        //checking if currentSum-k in map for each step 
        //if it is there means ther is a subarray with sum k at that index
        //then storing the prefix sum in the map
         Map<Integer, Integer> prefixSum= new HashMap<>();
         prefixSum.put(0,1);
         int sum=0;
         for(int i=0;i<nums.length;i++)
         {
             sum+=nums[i];
             int rem=sum-k;
             if(prefixSum.containsKey(rem))
             {
                    count+=prefixSum.get(rem);
             }
                 prefixSum.put(sum,prefixSum.getOrDefault(sum,0)+1);
         }
         return count;
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
        int k=in.nextInt();
        int result= CountOfsubArray.subarraySum(a, k);
        System.out.println("the count of sub array equals to array is "+result);
        in.close();
    }
}
