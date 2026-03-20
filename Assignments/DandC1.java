class DandC1{
    
    public static void sorts(String arr[] , int si , int ei){

        //base case
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        //left
        sorts(arr,si,mid);
        //right
        sorts(arr,mid+1,ei);
        //sort kore merge
        merge(arr,si,mid,ei);
    }

    public static void merge(String arr[] , int si, int mid , int ei){
        String temp[] = new String[(ei-si)+1]; //insert
        int i = si; //left pointer
        int j = mid+1; //right pointer

        int k = 0; //itterator of temp

        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<0){
                temp[k] = arr[i];
                k++;
                i++;
            }else{
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        //for leftovers
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //input into original array
        for(i = si , k = si ; i<temp.length ; i++,k++){
            arr[i] = temp[k];
        }

        
    }

    public static void printarr(String arr[]){
        for(int i = 0 ;i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    
    public static void main(String args[]){
        String arr[] = { "sun", "earth", "mars", "mercury"};
        sorts(arr,0,arr.length-1);
        printarr(arr);
    }
}