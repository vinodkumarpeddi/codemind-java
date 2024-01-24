import java.util.*;
public class vinod
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int seconds=sc.nextInt();
        int sec=seconds%60;
        int hour=seconds/60;
        int min=hour%60;
        hour=hour/60;
        System.out.println("H:M:S-"+hour+ ":"+min+":"+sec);
    }
}