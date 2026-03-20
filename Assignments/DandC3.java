class DandC3{
    
    public static void inversion(int arr[]){
        int temp[] = new int[2];
        boolean check = false;
        for(int i = 0 ; i<arr.length ; i++){
            temp[0] = arr[i];
            for(int j = i+1 ; j<arr.length ; j++){
                if(temp[0]>arr[j]){
                    temp[1] = arr[j];
                    check = true;
                    printarr(temp);
                    temp[1] = 0;
                    
                }
            }
        }
        if(!check){
            System.out.print("No inversion");
        }
    }
    public static void printarr(int temp[]){
        System.out.print("(");
        for(int i = 0 ;i<temp.length ; i++){
            System.out.print(temp[i] );
            if(i<temp.length-1){
                System.out.print(",");
            }
        }
        System.out.print(")");
    }
    
    public static void main(String args[]){
        int arr[] = {2,4,1,3,5};
        inversion(arr);
    }
}