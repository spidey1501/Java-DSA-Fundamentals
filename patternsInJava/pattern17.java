// *    
// ***   
// *****  
// ******* 
// *********
import  java.util.Scanner;
public class pattern17 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the size:");
        int N=x.nextInt();
        System.out.println("*******the pattern*******");
        for(int i=0;i<N;i++){
          
            // for printing the spaces.
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i+1;j++){
                
                System.out.print("*");

            }
            
            // for printing the spaces again.
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
            
        }
        x.close();
    }
}
