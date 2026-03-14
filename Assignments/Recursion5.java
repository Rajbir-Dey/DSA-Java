class Recursion5{
   
    public static void tofHanoi(int n , String src , String help , String dest){
        if(n==1){
            System.out.println("Move disk" + " " + n + " " + "from :" + " " + src + "to" + dest);
            return;
        }

        tofHanoi(n-1 , src , dest , help);
        System.out.println("Move disk" + " " + n + " " +  "from :" + " " + src + "to" + dest);
        tofHanoi(n-1 , help , src , dest);
    }
   
    public static void main(String args[]){
        int n = 2;
        tofHanoi(n,"S" , "H" , "D");
    }
}