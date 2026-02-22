
class test{
    int id;
    static String count;
    test(int id){
        this.id = id;
        count = "raj";
    }
}



class staticvar{
    public static void main(String args[]){
        String a = test.count;
        System.out.println(a);
        test t = new test(10);
        test t1 = new test(20);
        String b = test.count;
        System.out.println(b);

        System.out.println(a);
    }
}