/* Ques:- 1 -- Given an integer array nums, return true if any value appears at least twice in 
the array, and return false if every element is distinct. */

public class Array_Part1_Assignmenet {
    public static boolean  at_least_twice(int[] number)
    {
        int n=number.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(number[i]==number[j])
                {
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] number={1, 2, 3,3,2};
        System.out.println(at_least_twice(number));
    }
}
