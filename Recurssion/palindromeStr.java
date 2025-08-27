package Recurssion;
import java.util.Scanner;

public class palindromeStr {
    public boolean plaindrome(int i, String str){
        if (i>=str.length()/2)return true;
        if(str.charAt(i)!=str.charAt(str.length()-i-1))
        return false;
        return plaindrome(i+1, str);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string");
        String str= input.nextLine();
        palindromeStr ob=new palindromeStr();
        if(ob.plaindrome(0, str)){
            System.out.println(str+" is palindrome");
        }
        else{
             System.out.println(str+" is not palindrome");
        }
        input.close();
    }
}
