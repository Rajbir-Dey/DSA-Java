class fibonacci{
    
    
    public static int calculatefibonacci(int n){
        //basecase
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }else{
            return calculatefibonacci(n-1)+calculatefibonacci(n-2);
        }

    }
    
    public static void main(String args[]){
        int n = 6;
        System.out.println(calculatefibonacci(n));
    }
}