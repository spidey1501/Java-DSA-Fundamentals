// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
import java.util.Scanner;

public class pattern6 {
     public static void main(String [] args)
    {
        Scanner x= new Scanner(System.in);
        
        System.out.println("enter the size of the Row: ");
        int n = x.nextInt();
        // System.out.println("enter the size of the Col: ");
        // int col=x.nextInt();
        
        // char [][] arr= new char[row][col];
        // System.out.println("enter the array element");
        // for(int i=0;i<n;i++){
        //     for (int j=0;j<n-i;j++){
        //         // if ((i+j) % 2!=0)
        //         //     arr[i][j]= 1;
        //         // else
        //         //   arr[i][j]= 0;
        //         arr[i][j]= '*';
        //     }
        // }
        System.out.println("the pattern is:");
        for (int i = 0; i<n; i++) 
        {
            for (int j=0; j <n-i; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        
        }
        x.close();
    }
    
}
