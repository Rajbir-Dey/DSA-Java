class factorial{
    
    
    public static int fact(int n){
        //base-case
        if(n==0){
            return 1;
        }

        //recursive-call
        int f1 = fact(n-1);
        int fn = n*f1;

        return fn;
    }
    
    public static void main(String args[]){
        int n = 5;
        System.out.println(fact(n));
    }
}