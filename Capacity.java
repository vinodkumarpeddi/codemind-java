import java.util.*;
public class vinod
{
    public static void main(String[] args)
    {  
        Scanner sc =new Scanner(System.in);
        int T=sc.nextInt();
        int S=sc.nextInt();
        int B=sc.nextInt();
        int cap=2*T*S*B*512;
        int capinkb=cap/1024;
        System.out.println(capinkb+" "+"KB");
    }
}