import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch(ch)
        {
             case 'V','v':
                System.out.println("Violet");
                break;
             case 'I','i':
                System.out.println("Indigo");
                break;
             case 'B','b':
                System.out.println("Blue");
                break;
             case 'G','g':
                System.out.println("Green");
                break;
             case 'Y','y':
                System.out.println("Yellow");
                break;
             case 'O','o':
                System.out.println("Orange");
                break;
             case 'R','r':
                System.out.println("Red");
                break;
              default:
                 System.out.println("-1");
        }
    }
}