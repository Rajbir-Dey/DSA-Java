class Recursion4{
    
    
    public static void substr(String str){
        for(int i = 0; i<str.length() ; i++){
            for(int j = i+1 ; j<=str.length() ; j++){
                String subs = str.substring(i,j);

                int length = subs.length()-1;

                if(subs.charAt(0) == subs.charAt(length)){
                    System.out.println(subs);
                }
            }
        }
    }
    
    
    public static void main(String args[]){
        String str = "abcab";
        substr(str);
    }
}