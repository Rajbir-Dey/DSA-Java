class binstrings{
    
    
    public static void binways(int n , int ld , StringBuilder sb){

        //base case
        if(n==0){
            System.out.println(sb);
            return;
        }

        if(ld == 0){
            binways(n-1 , 0 , sb.append('0'));
            sb.deleteCharAt(sb.length()-1);

            binways(n-1 , 1 , sb.append('1'));
            sb.deleteCharAt(sb.length()-1);
            
        }else{
            binways(n-1 , 0 , sb.append('0'));
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
    
    
    public static void main(String args[]){
        int n = 3;
        int ld = 0;
        StringBuilder sb = new StringBuilder();
        binways(n,ld,sb);
    }
}