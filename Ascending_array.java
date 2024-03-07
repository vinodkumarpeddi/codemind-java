import java.util.*;
public class vinod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        boolean isace=true;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]>=arr[i])
            {
                isace=false;
                break;
            }
        }
        if(isace)
        System.out.println("yes");
        else
         System.out.println("no");
        
    }
}