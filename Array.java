
import java.util.Scanner;

public class Array {
    public static void main(String args[])
    {
        int A[]=new int[3];
        System.out.println("Enter the element in array :- ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Element of Arrey are :-");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+"  ");
        }
        System.out.print("\n");
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum+=A[i];
        }
        System.out.println(sum);
        
    }
}
