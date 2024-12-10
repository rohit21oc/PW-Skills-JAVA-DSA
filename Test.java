class Test{
    int a = 20;
    static String name = "prem";
    public static void main(String[] args) {
        // create object
        int num = 9;
        Test obj = new Test();
        Test obj2 = new Test();

        

        System.out.println(obj.a);
        System.out.println(name);
        obj2.name = "Rohit";
        System.out.println(obj2.name);
        // System.out.println(name); -->Error
    }
}
