
import java.util.Scanner;

class SubArray_using_PRIFIX_SUM{
    public static void main(String[] args) {
        System.out.println("Enter the size of array :- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element of array :- ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Your array are:-");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + "\t");
        }
        System.err.println();
        System.out.println("Sum of SubArray are :- ");
        MaxSubArrayUsingPRIFIX_SUM(a);
        sameArray(a);

    }
    static int[] MaxSubArrayUsingPRIFIX_SUM(int a[]) {
        int n=a.length;
        int prifix[]=new int[n];
        prifix[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            prifix[i]=prifix[i-1]+a[i];
        }
        for(int i=0;i<prifix.length;i++)
        {
            System.out.print(prifix[i]+"\t");
        }
        return prifix;
    }
/* Using prifix sum algorithm calculate prifix sum in same array without using other array */
    static int[] sameArray(int a[])
    {
        for(int i=1;i<a.length;i++){
            a[i]=a[i]+a[i-1];
        }
        System.out.println("Now prifix sum of given array without using other array :- ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
        return a;
    }
}