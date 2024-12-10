package Array;

public class Array {
    public static void main(String[] args) {
        int nums[] ={3,5,7,9};
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        
        int arraX[] = new int[4];
        arraX[0]=99;
        arraX[1]=95;
        arraX[2]=100;
        arraX[3]=96;

        System.out.println("Marks: ");
        for(int i =0;i<arraX.length;i++){
            System.out.println(arraX[i]);
        }
        // System.out.println(arraX[2]);
        int a = 5;
        System.out.println(a);

        String name[]={"rohit","sumit","utkarsh","deepak","lakshman"};
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        
    }
}
