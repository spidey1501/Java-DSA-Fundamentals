// A 
// B B 
// C C C 
// D D D D 
// E E E E E 
import java.util.Scanner;

public class pattern13 {
        public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number");
        int n =x.nextInt();
        char ch='A';

        for(char i=0;i<n;i++){

            for(char j='A';j<='A'+i;j++){
                System.out.print(ch+" ");
                
            }
            ch++;

            System.out.println();
        }
        x.close();  
}
}
