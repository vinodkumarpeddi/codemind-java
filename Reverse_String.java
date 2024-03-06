import java.util.*;
public class vinod
{
    public static String reverse(String s)
    {
        String[] words=s.split("\s+");
        StringBuilder reverse=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            reverse.append(words[i]);
            if(i>0)
            {
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s));
    }
}