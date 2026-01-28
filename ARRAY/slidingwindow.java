class slidingwindow{
     
     public static int window(int arr[] , int budget){
        int left =0;
        int right =0;
        int sum =0;
        int length = 0;
        for(right = 0 ; right<arr.length ; right++){
            sum += arr[right];  //expansion to get output

            while(sum>budget){
                sum -= arr[left]; //shrinking window for any exceeding of the output I need
                left++;
            }
            length = Math.max(right-left+1 , length);

        }

        return length;
     }
     
     
     
     public static void main(String args[]){
        int arr[] = {1,4,5,3,1,1,1,6};
        int budget = 6;
        System.out.println(window(arr,budget));
    }
}