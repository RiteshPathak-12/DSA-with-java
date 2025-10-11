public class Insertion_Sort {
    public static void main(String[] a){
        int arr[]={1,4,2,7,3};
        int[] sortedArray=InsertionSort(arr);
        for(int i=0;i<sortedArray.length;i++)
        {
            System.out.print(sortedArray[i]+"\t");
        }
    }
    public static int[] InsertionSort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;

            }
            a[j+1]=key;
        }
        return a;
    }
}
