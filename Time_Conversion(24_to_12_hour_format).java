import java.util.*;
public class vinod
{
    public static String convert(String time)
    {
        String[] parts=time.split(":");
        int hours=Integer.parseInt(parts[0]);
         int minutes=Integer.parseInt(parts[1]);
         String period;
         if(hours>=12)
         {
             period="PM";
             if(hours>12)
             {
                 hours-=12;
             }
         }
         else
         {
             period="AM";
             if(hours==0)
             {
                 hours=12;
             }
         }
         return String.format("%02d:%02d %s", hours, minutes, period);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String time=sc.nextLine();
        System.out.println(convert(time));
    }
}