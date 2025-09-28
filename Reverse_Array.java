
import java.util.Scanner;

public class Reverse_Array {
    public static void reverse(int number[])
    {
        int first=0;
        int last=number.length-1;
        while(first<last)
        {
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the numbers of array :- ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        reverse(a);
        System.out.println("Reverse of the given number :-");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
