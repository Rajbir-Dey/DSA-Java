class Modifiedbinary{
    
    public static int search(int arr[] , int tar , int si , int ei){
        //inavlid case
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        //base
        if(arr[mid] == tar){
            return mid;
        }
        //l1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr,tar,si,mid-1);
            }else{
                return search(arr,tar,mid+1,ei);
            }
        
        //l2
        }else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr,tar,mid+1,ei);
            }else{
                return search(arr,tar,si,mid-1);
            }
        }



    }
    
    
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2,3};
        int target = 2;
        int index = search(arr,target,0,arr.length-1);
        System.out.print(index);
    }
}