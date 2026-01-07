//java program to input weeknumber(1-7) and print day of weekname using switch case
import java.util.*;
class con_three{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        switch(a){
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default: System.out.println("Wrong  Number");              
        } 
            
    }
}  