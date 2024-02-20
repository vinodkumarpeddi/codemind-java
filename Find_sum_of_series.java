import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        double sum=0.0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            double a=1.0/i;
            sum+=a;
        }
        System.out.printf("%.2f",sum);
    }
}