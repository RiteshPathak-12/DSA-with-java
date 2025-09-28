class SubArray{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int Total_SubArray=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                Total_SubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total_SubArray = "+Total_SubArray);
    }
}