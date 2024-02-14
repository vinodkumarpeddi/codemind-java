import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String result=raindrop(n);
        System.out.println(result);
    }
    public static String raindrop(int n)
    {
        StringBuilder s=new StringBuilder();
        if(n%3==0)
        {
            s.append("Pling");
        }
         if(n%5==0)
        {
            s.append("Plang");
        }
         if(n%7==0)
        {
            s.append("Plong");
        }
        if(s.length()==0)
        {
            s.append(n);
        }
        return s.toString();
    }
}