
import java.util.Scanner;

public class bin {
    public static  int Binary_Search(int a[],int search)
    {
        int start=0;
        int end=(a.length)-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(a[mid]==search)
            {
                return mid;
            }
            if(a[mid]>search)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array :-");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the element those you want to search:-");
        int search=sc.nextInt();
        System.out.println("Enter the elements of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Elements of array you inserted in this are :-");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\n");
        int index=Binary_Search(a,search);
        System.out.println("Your element present at the position of "+index);

    }
}
