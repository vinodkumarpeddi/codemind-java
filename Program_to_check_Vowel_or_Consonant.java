import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'A','a':
                System.out.println("Vowel");
                break;
             case 'E','e':
                System.out.println("Vowel");
                break;
                 case 'I','i':
                System.out.println("Vowel");
                break;
                 case 'O','o':
                System.out.println("Vowel");
                break;
                 case 'U','u':
                System.out.println("Vowel");
                break;
                default:
                System.out.println("Consonant");
                break;
                 
        }
    }
}