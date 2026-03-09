class Tiling{
    
    public static int ways(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }

        int vertical = ways(n-1);
        int horizontal = ways(n-2);

        int totalways = horizontal + vertical;

        return totalways;
    }
    
    
    
    public static void main(String args[]){
        int twoX__ = 4;  //2 X 5
        System.out.println(ways(twoX__));
    }
}