class Main {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<3;i++){
            int j=3-i-1;
            System.out.println(arr[i][j]);
        }
    }
}
