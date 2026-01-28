import java.util.*;
class swap{
    
    public static void swap(String a){
        char temp;
        char arr[] = a.toCharArray();
        int size = arr.length-1; 
        
        for(int i=0; i<arr.length/2; i++){
            temp = arr[i];
            arr[i]=arr[size-i];
            arr[size-i]=temp;
        }

        System.out.println("Reversed String is:" + new String(arr));
        System.out.println("Reversed String is:" + new String(arr).getClass());
    }
    
    
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String:");
       String a = sc.next();
       swap(a);
    }
}




//approach 2
class Swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String a = sc.next();

        StringBuilder sb = new StringBuilder(a);
        sb.reverse();

        System.out.println("Reversed String is: " + sb);
    }
}
