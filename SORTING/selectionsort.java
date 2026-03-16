class selectionsort {
    
    public static void selection(int arr[]){
        for(int i = 0 ;i<arr.length ; i++){
            int min = i; //assume
            for(int j =i+1 ; j<arr.length ; j++){
                //check
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,6,8,1,7};
        selection(arr);
        printarr(arr);
    }
}