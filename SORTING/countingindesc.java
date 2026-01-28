import java.util.*;
class countingindesc{
   
    public static void sort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length; i++){
            if(arr[i]>max){
                max = Math.max(max,arr[i]);
            }
        }

        //freq arr
        int freq_arr[] = new int[max+1];
        for(int i=0 ; i<arr.length ; i++){
            freq_arr[arr[i]]++;
        }

        //arr mein put karr
        int j=0;
        for(int i=freq_arr.length-1 ; i>=0 ; i--){
            while(freq_arr[i]>0){
                arr[j]=i;
                j++;
                freq_arr[i]--;
            }
            

        } 

        System.out.println(Arrays.toString(arr));       

    }
   
   
    public static void main(String args[]){
        int arr[] = {5,3,2,1,3,2,3,4,1,4,5};
        sort(arr);
    }
}