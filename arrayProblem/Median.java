import java.util.Scanner;

public class Median {
    public void median(int a, int b,  int c){
        if((a<=b && b<=c)||(a>=b && b>=c)){
            System.out.println("meidan is :"+b);
        }
        else if((a>=b && a<=c)||(a<=b && a>=c)){
            System.out.println("meidan is :"+a);
        }
        else //if((c>=a && c<=b)||(c<=a && c>=b)){
            System.out.println("meidan is :"+c);
        
        //else System.out.println("meidan is :"+b);

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value A,B,C: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        Median ob= new Median();
        ob.median(a, b, c);
        s.close();
    }
}
