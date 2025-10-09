import java.util.Scanner;

public class Sellection_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array :-");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting :-");    
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("Array after sorting :-");

        int[] a= SelectionSort(arr);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    public static int[] SelectionSort(int a[])
    {
        for(int i=0;i<a.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minpos]>a[j]){
                    minpos=j;
                }
            }
            int temp=a[minpos];
            a[minpos]=a[i];
            a[i]=temp;
        }
        return a;
    }
}
