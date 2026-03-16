class Quicksort{
    
    public static void quicks(int arr[] , int si , int ei){
        if(si>=ei){
            return;
        }
        int piIndex = partition(arr,si,ei);

        quicks(arr,si,piIndex-1);
        quicks(arr,piIndex+1,ei);
    }

    public static int partition(int arr[] , int si , int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int  j = si ; j<ei ; j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        //swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void printarr(int arr[]){
        for(int i = 0 ;i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quicks(arr,0,arr.length-1);
        printarr(arr);
    }
}