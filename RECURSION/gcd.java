class gcd{

    public static int findgcd(int a , int b){
        if(a==0 && b==0){
            return 0;
        }else if(b==0){
            return a;
        }else{
            return findgcd(b, a%b);
        }
    }
    
    public static void main(String args[]){
        int a = 20;
        int b = 30;
        System.out.println(findgcd(a,b));
    }
}