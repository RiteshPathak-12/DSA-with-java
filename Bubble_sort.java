public class Bubble_sort {
    public static void main(String[] args) {
        int[] a={5,2,9,1};
        int[] b=BubbleSort(a);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+"\t");
        }
    }
    static int[] BubbleSort(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                int temp=0;
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
}
