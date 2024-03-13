import java.util.*;
public class vinod
{
    public static int fibonacci(int n)
    {
        if(n<=0)
        {
            return -1;
        }
        else if(n==1)
        {
            return 0;
        }
        else
        {
            int fib[]=new int[n];
            fib[0]=0;
            fib[1]=1;
            for(int i=2;i<n;i++)
            {
                fib[i]=fib[i-1]+fib[i-2];
            }
            return fib[n-1];
        }
        
    
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacci(n));
       
        
    }
}