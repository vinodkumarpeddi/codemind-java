import java.util.*;
public class vinod

{
    public static String converter(String octalvalue)
    {
        int octal=Integer.parseInt(octalvalue,8);
        String binary=Integer.toBinaryString(octal);
        return binary;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String octalvalue=sc.next();
             String result=converter(octalvalue);
             System.out.println(result);
        }
       
        
    }
}