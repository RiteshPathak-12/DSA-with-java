
import java.util.Scanner;

public class Max_SubArray_sum {
    public static void MaxSubArraySum(int number[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            for(int j=i;j<number.length;j++)
            {
                currSum=0;
                for(int k=i;k<=j;k++)
                {
                    currSum+=number[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum)
                {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum Sum of sub_Array :- "+maxSum);

    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array :- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number[]=new int[n];
        System.out.println("Enter the elements of Your array :- ");
        for(int i=0;i<n;i++)
        {
            number[i]=sc.nextInt();
        }
        MaxSubArraySum(number);
    }
}
