import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<3)
        {
            System.out.println("LIGHT");
        }
        else if(x>=3 && x<7)
        {
            System.out.println("MODERATE");
        }
        else if(x>=7)
        {
             System.out.println("HEAVY");
        }
    }
}