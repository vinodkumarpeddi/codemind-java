import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean ispalindrome=true;
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                ispalindrome=false;
                break;
            }
        }
        if(ispalindrome)
        {
            System.out.println("Palindrome");
        }
        else
        {
             System.out.println("Not Palindrome");
        }
    }
}