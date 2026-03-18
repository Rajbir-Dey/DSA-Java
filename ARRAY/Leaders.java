class Leaders{
    
    public static void leaderarray(int arr[]){
        int temp[] = new int[arr.length];
        int k = 0;
        for(int i = 0; i<arr.length; i++){
            Boolean check = true;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[j]>arr[i]){
                    check = false;
                    break;
                }
            }

            if(check == true){
                temp[k++] = arr[i]; 
            }
        }

        printarr(temp);
    }

    public static void printarr(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]!=0){
                System.out.print(arr[i] + " ");
            }
            
        }
    }
    
    public static void main(String args[]){
        int arr[] = {3,18,1,17,4};
        leaderarray(arr);
    }
}