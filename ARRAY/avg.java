class avg{
    
    public static int averagesum(int arr[]){
        int n = arr.length;
        int sum = 0;
        int count = 0;
        for(int i = 1 ; i<n ; i++){
            sum+=arr[i-1];
            if(arr[i]> sum/i){
                count++;
            }
        }
        return count;
    }
    
    
    public static void main(String args[]){
        int arr[] = {100,200,150,300};
        System.out.println(averagesum(arr));
    }
}