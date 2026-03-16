import java.util.Arrays;
class insertionsort{
    
    
    public static void insertion(int arr[]){
        for(int i=1; i<arr.length ; i++){
            int temp_currval =arr[i];
            int prev= i-1;
            while(prev>=0 && arr[prev]>temp_currval){
                arr[prev+1]=arr[prev];
                prev--; //for left check, aro elements ache nki in sorted part.
            }

            arr[prev+1]=temp_currval;
        }

        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2,6};
        insertion(arr);
    }
}