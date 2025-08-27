import java.util.Scanner;

public class pattern22 {
        public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number");
        int n =x.nextInt();
        System.out.println("======THE PATTERN======");
        // int num=1;
        for(int i=1;i<=n;i++){
            int s=i;
            for(int j=1;j<=i;j++){

                System.out.print(s+" ");
                s=s+(n-1);
                if(j>=2){
                    s=s-j+1;
                }
                
                // num +=1;
                // System.out.println(++j);
            }
            System.out.println();
        }
        x.close();  
    }
}
