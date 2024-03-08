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
         for(int num : arr)
         {
             if(num%2!=0 && !unique.contains(num))
             {
                 unique.add(num);
                 sum+=num;
             }
         }
         System.out.println(sum);
    }
}
