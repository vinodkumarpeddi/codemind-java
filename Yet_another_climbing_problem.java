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
            int c=a/b;
            int d=a%b;
            System.out.println(c+d);
        }
    }
}