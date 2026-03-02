import java.util.*;
class countingminutes{

    public static void count(String time){
        String arr[] = time.split("-");
        String t1 = arr[0];
        String t2 = arr[1];

        int starttime = calculatetime(t1);
        int endtime = calculatetime(t2);

        if(endtime<= starttime){
            endtime += 1440;
        }

        System.out.println(endtime-starttime);
    }

    public static int calculatetime(String time){
        int n = time.length();
        String ampm = time.substring(n-2);
        String timepart = time.substring(0,n-2);
        String parts[] = timepart.split(":");

        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if(ampm.equals("pm") && hour != 12){
            hour+=12;
        }

        if(ampm.equals("am") && hour == 12){
            hour = 0;
        }

        return hour*60+minute;

    }
    
    public static void main(String args[]){
        String time = "12:30pm-12:00am";
        count(time);
    }
}