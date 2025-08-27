// E 
// D E 
// C D E 
// B C D E 
// A B C D E 
import java.util.Scanner;

public class pattern14 {
        public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number");
        int N=x.nextInt();
        System.out.println("The pattern:");

        for(int i=0;i<N;i++){

            for(char ch =(char)(int)('A'+N-1-i);ch<=(char)(int)('A'+N-1);ch++){
            //    ch = (char)(int)(ch+(n-i-1));
                System.out.print(ch+" ");
            }

            System.out.println();
        }
        x.close();  
}
}
