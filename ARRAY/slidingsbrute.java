import java.lang.Math;
class slidingsbrute{
    
    public static int budgetsum(int arr[] , int budget){
        int n = arr.length;
        int temp=0;
        int value=0;
        int length=0;
        for(int i=0 ; i<n ; i++){
            int sum = 0;
            for(int j=i ; j<n ;j++){
                temp = arr[j];
                sum = sum+temp;
                if(sum==budget){
                    length = j-i+1;
                    value = Math.max(length,value);
                }
            }
        }

        return value;
    }
    
    public static void main(String args[]){
        int arr[] = {1,4,5,3,1,1,1,6};
        int budget = 6;
        System.out.println(budgetsum(arr,budget));
    }
}