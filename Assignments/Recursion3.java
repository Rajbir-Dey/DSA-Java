class Recursion3{
    
    
    public static void length(String str , int i ){

        //basecase
        if(i == str.length()){
            System.out.print(i-1);
            return;
        }

        if(i<=str.length()){
            length(str,i+1);
        }
    }
    
    
    public static void main(String args[]){
        String str = "Rajbir";
        int index = 0;
        length(str,index);
    }
}