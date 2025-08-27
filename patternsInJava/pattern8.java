// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=x.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");               
            }
            System.out.println();            
        }
        for (int k=0;k<n;k++){
            for(int h=0;h<n-k-1;h++){
                System.out.print("* ");
            }
            System.out.println();
        }

        x.close();
    }
}
