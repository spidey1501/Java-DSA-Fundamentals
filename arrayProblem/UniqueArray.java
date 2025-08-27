import java.util.Scanner;
//SOLUTION IS FOR SORTED ARRAYS!!!!!!

public class UniqueArray {
    public int removeDuplicates(int[] nums) {
        // Length of the updated array
        int count = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will update the array in place
            nums[count] = nums[i];
            count++;
        }
        return count;
       }



       public int removeDuplicates1(int []nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;

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
        UniqueArray ob=new UniqueArray();
        //ONLINE METHOD
        // int count= ob.removeDuplicates(arr); 
        // System.out.println("unique array is ");
        // for(int i=0;i<count;i++)
        // {System.out.print(arr[i]+" ");}
        

        /// ANOTHER METHOD
        int len= ob.removeDuplicates1(arr);
        System.out.println("unique array is(second function) ");
        for(int i=0;i<len;i++)
        {System.out.print(arr[i]+" ");}

        s.close();
    }
}
