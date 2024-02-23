import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split("\s+");
        int count=words.length;
        System.out.println(count);
    }
}