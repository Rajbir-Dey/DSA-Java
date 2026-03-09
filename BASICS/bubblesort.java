class bubblesort{
    
    
    public static void sorts(int arr[]){
        int n = arr.length;
        int temp = 0;

        for(int i =0 ; i<n-1 ; i++){
            for(int j = 0 ; j<n-1-i ; j++){

                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.print("{");
        for(int i = 0 ;i<n ; i++){
            System.out.print(arr[i]);
            if(i != n-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
    
    
    
    public static void main(String args[]){
        int arr[] = {2,3,1,4,5,6};
        sorts(arr);
    }
}