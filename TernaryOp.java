public class TernaryOp{
    public static void main(String[] args) {
     int a=10;   
     int b=50;  
     int c=30; 
    //  int res = (a<b)?(a<c?a:b):(b<c?b:c);
    int result = (a>b)?(a>c?a:b):(b>c?b:c);
    //  System.out.println(res);
     System.out.println(result);

     String results = (a>b)?"a i bigger":"b is bigger";
     String res1 = (a>b)?(a>c?"a is bigger":"b is bigger"):(b>c?"b is bigger":"c is bigger");
     System.out.println(res1);
     System.out.println(results);
    }
}