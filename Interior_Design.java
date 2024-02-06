import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int first=x1+y1;
        int second=x2+y2;
        if(first < second)
        {
            System.out.println(first);
        }
        else
        {
            System.out.println(second);
        }
    }
}