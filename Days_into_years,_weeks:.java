import java.util.*;
public class vinod
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int years=days/365;
        int weeks=(days%365)/7;
        System.out.println(years);
        System.out.println(weeks);
    }
}