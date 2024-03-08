import java.util.*;

public class vinod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int minnum = Integer.MAX_VALUE; // Initialize to the largest possible integer value
        for (int i = 0; i < n; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                minnum = Math.min(minnum, arr[i]);
            }
        }
        if (minnum == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(minnum);
        }
    }
}
