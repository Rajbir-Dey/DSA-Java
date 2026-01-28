import java.util.*;
class subarraysum{
    
    public static void subarr(int arr[]){

        int sum=0;
        int temp= 0;
        int largest= Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        int lstart = 0, lend = 0, sstart = 0, send = 0;

        for(int i=0; i<arr.length;i++){
            sum=0;
            
            for(int j=i;j<arr.length;j++){
                
                temp= arr[j];
                sum= sum+temp;
                if(sum>largest){
                    largest= sum;
                    lstart= i;
                    lend= j;
                }
                if(sum<smallest){
                    smallest= sum;
                    sstart= i;
                    send=j;
                }
                
                
                for(int k= i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println(" =>  This pair sum = "+ sum);
            }
           
        }
        System.out.print("\n The maximum sum pair is: ");
        for(int i= lstart; i<=lend; i++){
            System.out.print(arr[i] + " ");
            
            
        }
        System.out.println("\n SUM  => "+ largest);
        
        System.out.print("\n The minimum sum pair is: ");
        for(int j= sstart; j<=send; j++){
            System.out.print(arr[j]+ " " );
            
            
        }
        System.out.println("\n SUM  => "+ smallest);
        
        
    }
    
    
    
    public static void main(String args[]){
        int arr[]= {1,4,5,3,2,1,6};
        subarr(arr);
    }
}