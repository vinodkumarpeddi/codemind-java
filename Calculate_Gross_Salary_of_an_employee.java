import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double bs=sc.nextDouble();
        double hra=sc.nextDouble();
        double da=sc.nextDouble();
        double pf=bs*0.12;
        double gs=bs+hra+da+pf;
        System.out.printf("%.2f
%.2f",pf,gs);
        //System.out.printf("%.2f",gs);
        
    }
}