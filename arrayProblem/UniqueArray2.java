import java.util.ArrayList;
import java.util.Scanner;

public class UniqueArray2 {
    public static ArrayList<Integer> UniqueArray1(int a1[],int a2[])
    {
        int n1=a1.length;
        int n2=a2.length;
        ArrayList<Integer> temp=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            if(a1[i]<a2[j]){
                if(temp.size()==0||temp.get(temp.size()-1)!=a1[i]){
                    temp.add(a1[i]);
                }
                i++;
            }
            else{
                if(temp.size()==0||temp.get(temp.size()-1)!=a2[j]){
                    temp.add(a2[j]);
                    j++;
                }
            }
        }
        while(j<n2)
        {
            if(temp.size()==0||temp.get(temp.size()-1)!=a2[j])
            {
                temp.add(a2[j]);
                j++;
            }
        }
        while(i<n1)
        {
            if(temp.size()==0||temp.get(temp.size()-1)!=a1[i])
            {
                temp.add(a2[j]);
                i++;
            }
        }
    return temp;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of 1st array");
        int n1=in.nextInt();
        int a1[]=new int[n1];
        System.out.println("enter the array elements");
        for(int i=0;i<n1;i++){
            a1[i]=in.nextInt();
        }
        System.out.println("enter the size of 1st array");
        int n2=in.nextInt();
        int a2[]=new int[n2];
        System.out.println("enter the array elements");
        for(int j=0;j<n2;j++){
            a2[j]=in.nextInt();
        }
        System.out.println(UniqueArray1(a1, a2));
        

        in.close();
    }
}
