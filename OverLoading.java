import java.util.Scanner;

class type{
    // public void show(int n){
    //     System.out.println("Int: "+n);
    // }
    public void show(short n){
        System.out.println("Short: "+n);
    }
    public void show(byte n){
        System.out.println("Int: "+n);
    }
    public void show(double n){
        System.out.println("double: "+n);
    }
    // public void show(char n){
    //     System.out.println("char: "+n);
    // }
    // public void show(float n){
    //     System.out.println("float: "+n);
    // }
}

class Calc {

    

    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
    public int add(int n1, int n2,int n3) {
        int result = n1 + n2+ n3;
        return result;
    }
    public double add(double n1, double n2) {
        double result = n1 + n2;
        return result;
    }
}

public class OverLoading {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Calc obj = new Calc();
        int result = obj.add(20, 50);
        System.out.println(result);
        int result1 = obj.add(20, 50,60);
        System.out.println(result1);
        double result2 = obj.add(20.6, 50.5);
        System.out.println(result2);


        type objType = new type();
        objType.show('p');
        
    }
}
