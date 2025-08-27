// A B C D E 
// A B C D 
// A B C 
// A B 
// A 
import java.util.Scanner;

public class pattern12 {
    
    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number");
        int n =x.nextInt();

        for(int i=0;i<n;i++){

            for(char j='A';j<='A'+(n-i-1);j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
        x.close();  
}
}
