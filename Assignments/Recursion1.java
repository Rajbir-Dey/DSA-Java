class Recursion1{
    
    public static void calcindex(int arr[] ,int i , int key){
        
        //base-case
        if(i == arr.length){
            return;
        }
        
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        calcindex(arr , i+1 , key);
    }
    
    
    public static void main(String args[]){
        int arr[] = {3,2,4,2};
        int key = 2;
        int i = 0;
        calcindex(arr , i , key);
    }
}