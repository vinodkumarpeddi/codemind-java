import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {int count=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int j=a;j<=b;j++)
            {
                if(j%10==2 || j%10==3 || j%10==9)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}