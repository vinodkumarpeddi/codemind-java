import java.util.*;

public class vinod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         Set<Integer> unique=new HashSet<>();
         int sum=0;
         for(int i=0;i<n;i++)
         {
             if(arr[i]%2==0 && !unique.contains(arr[i]))
             {
                 unique.add(arr[i]);
                 sum+=arr[i];
             }
         }
         System.out.println(sum);
    }
}
