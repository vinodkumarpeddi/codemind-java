import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        int c;
       System.out.print(0+" "+1);
       for(int i=2;i<n;i++)
       {
           c=a+b;
           a=b;
           b=c;
           System.out.print(" "+c);
       }
    }
}