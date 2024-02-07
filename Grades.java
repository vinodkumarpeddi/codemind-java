import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         int b=sc.nextInt();
          int c=sc.nextInt();
           int d=sc.nextInt();
            int e=sc.nextInt();
            int per=(a+b+c+d+e)/5;
            if(per>=90)
            {
                System.out.println("Grade A");
            }
           else if(per>=80)
            {
                System.out.println("Grade B");
            }
            else if(per>=70)
            {
                System.out.println("Grade C");
            }
            else if(per>=60)
            {
                System.out.println("Grade D");
            }
            else if(per>=40)
            {
                System.out.println("Grade E");
            }
            else
            {
                System.out.println("Grade F");
            }
    }
}