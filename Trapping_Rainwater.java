
import java.util.Scanner;

/*Given n non - negative integers representing an elevation map where the width of each bar is 1 
 * compute how much water it can trap after raining*/


public class Trapping_Rainwater {

    public static int TrappingRainwater(int height[]) {
        int n=height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        //Calculate the left max boundry - array
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        //Calculate the right max boundry - array
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }  
        int trapWater=0;
        for(int i=0;i<n;i++)
        {
            //calculate the water level by comparing minimum of left boundry and right boundry
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            //Adding water level in trap water
            trapWater+=waterLevel-height[i];
        }
        return trapWater;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the bars :- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int height[]=new int[n];
        System.out.println("Enter the height of bars :- ");
        for(int i=0;i<n;i++)
        {
            height[i]=sc.nextInt();
        }
        System.out.println("The total water storing in the building "+TrappingRainwater(height));
        

    }
}
