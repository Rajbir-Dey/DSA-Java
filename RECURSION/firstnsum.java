import java.util.*;
class firstnsum{
    
    
    public static int sum(int n){
        //base-case
        if(n==1){
            return 1;
        }

        int s1 = sum(n-1);
        int sn = s1+n;

        return sn;
        
    }
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}