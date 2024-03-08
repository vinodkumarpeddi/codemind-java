import java.util.*;
public class solution
{
    public static int climbing(int n)
    {
        if(n==1) return 1;
        if (n==2) return 2;
        int ways[]=new int[n+1];
          ways[1]=1;
          ways[2]=2;
          for(int i=3;i<=n;i++)
          {
              ways[i]=ways[i-1]+ways[i-2];
          }
          return ways[n];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(climbing(n));
    }
}