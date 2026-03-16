class insertionsort {
    
    public static void insertion(int arr[]){
        for(int i = 1 ;i<arr.length ; i++){
            
            int temp = arr[i]; //temp e asche

            int j =i-1; //right shift korar value

            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j]; //rightshift
                j--; 
            }
            arr[j+1] = temp; //ith pos e insert er jonno
        }
    }
    public static void printarr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,6,8,1,7};
        insertion(arr);
        printarr(arr);
    }
}