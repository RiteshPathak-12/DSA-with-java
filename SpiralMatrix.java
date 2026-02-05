import java.util.Scanner;

public class SpiralMatrix {

    public static void spiralMatrix(int a[][]) {
        int top = 0;
        int left = 0;
        int bottom = a.length - 1;
        int right = a[0].length - 1;

        while (top <= bottom && left <= right) {

            // Top row
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

        System.out.println("Enter number of columns:");
        int m = sc.nextInt();

        int a[][] = new int[n][m];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Spiral Order:");
        spiralMatrix(a);
    }
}
