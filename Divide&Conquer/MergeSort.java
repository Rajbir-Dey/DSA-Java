class MergeSort{
    
    
    public static void mergesort(int arr[] , int si , int ei){
        
        if(si>=ei){
            return;
        }
        
        int mid = (si+ei)/2;
        mergesort(arr , si , mid); //left-part
        mergesort(arr , mid+1 , ei); //right-part
        merge(arr , si , mid , ei);
    }

    public static void merge(int arr[] , int si , int mid , int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //left iterator
        int j = mid+1; //right iterator
        int k = 0; //temp iterator

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }else{
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        // for leftovers
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //copyyy
        for(k = 0 , i = si ; k < temp.length ; k++ , i++){
            arr[i] = temp[k];
        }

        
    }

    //array printing
    public static void printarr(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2};
        mergesort(arr , 0 , arr.length-1);
        printarr(arr);
    }
}