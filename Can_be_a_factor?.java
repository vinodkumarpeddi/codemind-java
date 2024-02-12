import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int diff=Math.abs(a-b);
        if(a==b || diff >= a)
        System.out.println("YES");
        else
        System.out.println("NO");
        }
    }
}