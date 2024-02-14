import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n1=sc.nextInt();
          int n2=sc.nextInt();
           int x=sc.nextInt();
           int temp=0;
           int count=0;
           if(n1>n2)
           {
               System.out.println("-1");
           }
           else
           {
               while(temp<=x)
               {
                   x=x+n1;
                   temp=temp+n2;
                   count++;
               }
                System.out.println(count);
           }
           
           
        
    }
}