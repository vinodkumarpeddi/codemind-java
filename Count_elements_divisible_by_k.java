import java.util.*;

public class vinod {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int k=sc.nextInt();
        int arr[]=new int[n];
         for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k==0)
            {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
