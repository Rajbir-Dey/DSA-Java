class Duplicateelement{
    
    
    
    public static void rmdupli(String str , int idx , int arr[] , StringBuilder sb){
        //base case
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }

        char curr = str.charAt(idx);
        if(arr[curr -'a'] == 1){
            rmdupli(str,idx+1,arr,sb);
        }else{
            arr[curr - 'a'] = 1;
            rmdupli(str,idx,arr,sb.append(curr));
        }
    }
    
    
    public static void main(String args[]){
        String str = "apnnacollegee";
        int idx = 0;
        int arr[] = new int[26];
        StringBuilder sb = new StringBuilder();
        rmdupli(str,idx,arr,sb);
    }
}