import java.util.*;

public class Vinod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            
            if ((N + K) < M) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
