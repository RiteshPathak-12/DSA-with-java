
import java.util.Scanner;

public class Array_Largest {
    public static void main(String[] args) {
        System.out.println("Enter the size of array :- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        System.out.println("Enter the Element of Array :- ");
        for(int i=0;i<number.length;i++)
        {
            number[i]=sc.nextInt();
        }
        int Lar=Largest(number);
        System.out.println("Largest number in the Array :- "+Lar);
        int small=Smallest(number);
        System.out.println("Smallest number in The Array :- "+small);

    }
    public static int Largest(int number[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(number[i]>largest)
            {
                largest=number[i];
            }
        }
        return largest;
    }
    public static int Smallest(int number[])
    {
        int largest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(number[i]<largest)
            {
                largest=number[i];
            }
        }
        return largest;
    }
}
