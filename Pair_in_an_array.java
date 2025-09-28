class Pair_in_an_array{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.err.print("("+arr[i]+" , "+arr[j]+")");
            }
            System.err.println();
        }   
    }
}