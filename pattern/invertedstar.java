import java.util.*;
class invertedstar{
   
    public static void starr (int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=(n+1)-i ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        starr(n);
    }
}