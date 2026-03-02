import java.util.*;
class stringperiod{
    
    public static void period(String str){
        int length = str.length();
        
        //atleast n/2
        for(int i = length/2 ; i>0 ; i--){
            if(length%i == 0){
                String s = str.substring(0,i);

                StringBuilder sb = new StringBuilder();
                int repeat = length/i;
                for(int j=0 ; j<repeat ; j++){
                    sb.append(s);
                }

                if(sb.toString().equals(str)){
                    System.out.println(s);
                    return;
                }
            }
        }
        System.out.println("-1");
        
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.next();
        period(str);
    }
}