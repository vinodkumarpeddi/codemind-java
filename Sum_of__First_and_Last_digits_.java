import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last,first,sum=0;
        last=n%10;
        while(n>=10)
        {
            n=n/10;
        }
        first=n;
        
        sum=first+last;
        System.out.println(sum);
       
    }
}