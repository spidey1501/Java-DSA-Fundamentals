// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
import java.util.Scanner;

public class pattern2 {
     public static void main(String [] args)
    {
        Scanner x= new Scanner(System.in);
        
        System.out.println("enter the size of the Row: ");
        int row = x.nextInt();
        System.out.println("enter the size of the Col: ");
        int col=x.nextInt();
        
        char [][] arr= new char[row][col];
        // System.out.println("enter the array element");
        for(int i=0;i<row;i++){
            for (int j=0;j<=i;j++){
                // if ((i+j) % 2!=0)
                //     arr[i][j]= 1;
                // else
                //   arr[i][j]= 0;
                arr[i][j]= '*';
            }
        }
        System.out.println("the array elements are:");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j <=i; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        
        }
        x.close();
    }
    
}
