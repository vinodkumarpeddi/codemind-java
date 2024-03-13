import java.util.*;
public class vinod
{
    public static boolean Palindrome(int n)
    {
           int s=n;
           int sum=0,r;
           while(n>0)
           {
               r=n%10;
               sum=sum*10+r;
               n=n/10;
           }
           return s==sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(Palindrome(arr[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}