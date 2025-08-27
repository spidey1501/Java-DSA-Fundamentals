// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321
import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number");
        int n =x.nextInt();
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }


            System.out.println();
            space-=2;
        }
        x.close();  
    
    }
}
