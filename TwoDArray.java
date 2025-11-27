
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n=sc.nextInt();
        System.out.println("Enter the number of column");
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of matrix are");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        searchElement(a, key);
    }
    public static boolean  searchElement(int a[][],int key){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==key){
                    System.out.println("Element found at index: "+i+","+j);
                    return true;
                }
                
            }
        }
        System.out.println("Element not found");
        return false;
    }
}
