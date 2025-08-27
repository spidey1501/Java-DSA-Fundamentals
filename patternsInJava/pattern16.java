// *********
//  *******
//   *****
//    ***
//     *
import java.util.Scanner;

public class pattern16 {

        public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number");
        int n=x.nextInt();
        System.out.println("The pattern:");
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*n)-(2*i)-1;j++){
                System.out.print("*");
            }
            // for(int j=0;j<i;j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
        

        x.close();  
}
    
}
