class Main {
    public static void main(String[] args) {
        int arr[]={10,20,30,5,60};
        int[] arr2=new int[5];
        for(int i=0;i<arr.length;i++) arr2[i]=arr[i];
        System.out.print("ARRAY 1: ");
        for(int i:arr) System.out.print(i+" ");
        System.out.print("\nARRAY 2: ");
        for(int i:arr2) System.out.print(i+" ");
    }
}
