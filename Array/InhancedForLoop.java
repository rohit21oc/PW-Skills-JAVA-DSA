package Array;

public class InhancedForLoop {
    public static void main(String[] args) {
        // 1D Array
        int arr[] = {1,2,3,4,5};
        System.out.println("1D array");
        for(int i :arr){
            System.out.print(i+" ");
        }
        System.out.println();

        // 2D Array
        int nums[][] = {
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5}
        };
        System.out.println("2D array");
        for(int a[]:nums){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println(); 
        }

        String name[][] = {
            {"Rohit","Prem","Subhash","Uma Shankar"},
            {"Rohit","Prem","Subhash","Uma Shankar"},
            {"Rohit","Prem","Subhash","Uma Shankar"}
        };
        for(String a[] : name){
            for(String b:a){
                System.out.print(b+", ");
            }
            System.out.println();
        }
    }
}
