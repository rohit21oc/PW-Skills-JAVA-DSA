package Array;

public class Demo2Darray {
    public static void main(String[] args) {
        // int arr[][] = new int[3][];
        // arr[0] = new int[4];
        // arr[1] = new int[2];
        // arr[2] = new int[5];
        // arr[3] = new int[6];

        // arr[0][0] = 5;
        // arr[0][1] = 4;
        // arr[1][0] = 8;
        // arr[1][1] = 9;
        // arr[2][0] = 7;
        // arr[2][1] = 3;

        int arr[][] = {
            {1,2,5},
            {3,4,6},
            {5,6,6},
            {5,6,6}
        };

        for(int i=0;i<=3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
