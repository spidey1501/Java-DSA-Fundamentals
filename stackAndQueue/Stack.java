package stackAndQueue;

//Java program to create a stack with given capacity
import java.util.Scanner;
class Stack1 { 
    int top, cap; 
    int[] a;
    Scanner n= new Scanner(System.in); 

    public Stack1(int cap) { 
        this.cap = cap; 
        top = -1; 
        a = new int[cap]; 
    } 

    public boolean push() { 
        if (top >= cap - 1) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        System.out.println("enter the element to push:");
        int x=n.nextInt();
        a[++top] = x; 
        return true; 
    } 

    public int pop() { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        return a[top--]; 
    } 

    public void peek() { 
        if (top < 0) { 
            System.out.println("Stack is Empty"); 
            return ; 
        } 
        System.out.println("The Stack elements are:");
        for(int i=top;i>=0;i--){
            System.out.println(a[i]);
        }
       
    } 

    public boolean isEmpty() { 
        return top < 0; 
    } 

} 

public class Stack { 
    public static void main(String[] args) { 
        Scanner size= new Scanner(System.in);
        System.out.println("enter size of capacity");
        int n=size.nextInt();
        Stack1 s = new Stack1(n); 
        System.out.println("Select from 1,2,3 or 4:");
        System.out.println("1.push\n2.pop\n3.display\n4.exit");
        Scanner c=new Scanner(System.in);
        int choice;
                do{
                    System.out.println("enter your choice(1/2/3/4):");
                    choice=c.nextInt();
                    switch (choice) {
                        case 1:
                        s.push();  
                            break;
                        case 2:
                        int popped = s.pop();
                        if (popped != -1)
                        System.out.println(popped + " popped from stack");
                        break;
                        case 3:
                        s.peek();
                        break;
                        case 4:
                        System.out.println("You exited from the program");
                        break;
                    
                        default:
                        System.out.println("Select valid choice (1/2/3/4)");
                            break;
                    }
                } while (choice!=4);

        c.close();
        size.close();
        } 

    } 
