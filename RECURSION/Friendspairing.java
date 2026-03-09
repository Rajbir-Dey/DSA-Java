class Friendspairing{
    
    public static int totalway(int n){
        //base-case
        if(n==1 || n==2){
            return n;
        }

        //single
        int single = totalway(n-1);
        //pair
        int pair = (n-1)*totalway(n-2);

        int totalways = single+pair;

        return totalways;
    }
    
    public static void main(String args[]){
        int n = 3;
        System.out.print(totalway(n));
    }
}