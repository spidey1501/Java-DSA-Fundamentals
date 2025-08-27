// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5 
import java.util.Scanner;

public class pattern4 {
     public static void main(String [] args)
    {
        Scanner x= new Scanner(System.in);
        
        System.out.println("enter the size of the Row: ");
        int n = x.nextInt();
        // System.out.println("enter the size of the Col: ");
        // int col=x.nextInt();
        
        // int [][] arr= new int[row][col];
        // // System.out.println("enter the array element");
        // for(int i=0;i<row;i++){
        //     for (int j=0;j<=i;j++){
        //         // if ((i+j) % 2!=0)
        //         //     arr[i][j]= 1;
        //         // else
        //         //   arr[i][j]= 0;
        //         arr[i][j]= j+1;
        //     }
        // }
        System.out.println("the array elements are:");
        for (int i = 0; i<n; i++) 
        {
            for (int j=0; j <=i; j++){
                System.out.print(i+1 +" ");
            }
            System.out.println();
        
        }
        x.close();
    }
    
    
}
