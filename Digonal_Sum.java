import java.util.Scanner;

public class Digonal_Sum {
    public static void Digonal_Sum_of_matrix(int a[][])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i==j)
                {
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("The sum of diagonals are :"+sum);
    }
    public static void main(String arg[])
    {
        System.out.println("Enter the number of row of matrix ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number of column of matrix ");
        int m=sc.nextInt();
        int a[][]= new int[n][m];
        System.out.println("Enter the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        if(a.length==a[0].length)
        {
            Digonal_Sum_of_matrix(a);
        }
        else{
            System.out.println("The matrix is not square matrix so we can't find the sum of diagonals");
        }
    }
}
