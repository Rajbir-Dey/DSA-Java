class Optipower{
    
    public static int powers(int x, int n){
        
        //base-case
        if(n==0){
            return 1;
        }
        int halfsq = powers(x ,n/2) * powers(x,n/2);

        //for odd
        if(n%2 != 0){
            halfsq = x*halfsq;
        }

        return halfsq;
    }
    
    
    public static void main(String args[]){
        int x = 2;
        int n = 5;
        System.out.println(powers(x,n));
    }
}