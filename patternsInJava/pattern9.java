// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number");
        int n =x.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){

                System.out.print(num+" ");
                num +=1;
                // System.out.println(++j);
            }
            System.out.println();
        }
        x.close();  
    }
    // x.close();
    
}


// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
