// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * * 
import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the size:");
        int n=x.nextInt();
        System.out.println("------THE PATTERN-----");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0|| i==n-1 || j==0 || j==n-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        x.close();
    }
}
