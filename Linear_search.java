//Code for linear search
import java.util.Scanner;

public class Linear_search {
    public static int LinearSearch(int []number,int key)
    {
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        System.out.println("Enter the number of element in array : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        System.out.println("Enter the element of array :-");
        for(int i=0;i<size;i++)
        {
            number[i]=sc.nextInt();
        }
        System.out.println("Enter the element that you want to find in array :-");
        int key=sc.nextInt();
        int index=LinearSearch(number, key);
        if(index==-1)
        {
            System.out.println("Number are not found");
        }
        else
        {
            System.out.println("Element at the index are = "+index);
        }
    }
}
