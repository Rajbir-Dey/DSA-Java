class kadane{
    
    public static void kadanes(int arr[]){
        int i;
        int ms= Integer.MIN_VALUE;;
        int cs= 0;

        for(i=0; i<arr.length ; i++){
            cs = cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs,ms);
        }

        if(ms==0){
            ms = arr[0];
            for(i=1; i< arr.length; i++){
                ms = Math.max(ms,arr[i]);
            }
        }
        System.out.println("maximum sum is:" + ms);
    }
    
    public static void main(String args[]){
        int arr[] = {-2,-3,-4,-1,-2,-3};
        kadanes(arr);
        }
}














/*When we take -2, the current sum becomes negative, so it is reset to zero.
The maximum sum is the maximum of current sum and the old maximum → max(0, -∞) = 0.

When we take -3, again the current sum is negative and reset to zero.
The maximum sum is → max(0, 0) = 0.

When we take 4, the current sum becomes four.
The maximum sum is → max(4, 0) = 4, so it gets updated. ✅

When we take -1, the current sum drops to three.
The maximum sum is → max(3, 4) = 4, so it stays the same.

When we take -2, the current sum reduces to one.
The maximum sum is → max(1, 4) = 4, so no change.

When we take 1, the current sum rises slightly to two.
The maximum sum is → max(2, 4) = 4, still unchanged.

When we take 5, the current sum jumps to seven.
The maximum sum is → max(7, 4) = 7, so it gets updated. ✅

When we take -3, the current sum drops back to four.
The maximum sum is → max(4, 7) = 7, so it stays the same.*/