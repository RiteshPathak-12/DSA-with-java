
import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        System.out.println("Enter the Size of array :- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        System.out.println("Enter the element of array in Sorted order :-");
        for(int i=0;i<number.length;i++)
        {
            number[i]=sc.nextInt();
        }
        System.out.println("Enter the element that you want to find in array :-");
        int key=sc.nextInt();
        int index=Binary_Search(number,key);
        System.out.println("Element "+key+" Present in the index at "+index);
    }
    public static int Binary_Search(int number[],int key)
    {
        int start=0;
        int end=number.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(number[mid]==key)
            {
                return mid;
            }
            if(number[mid]<key)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
