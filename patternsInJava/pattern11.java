// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
import java.util.Scanner;

public class pattern11 {
    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number");
        int n =x.nextInt();
        System.out.println("The pattern");
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        x.close();  
}
}
