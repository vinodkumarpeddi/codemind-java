import java.util.*;

public class vinod {
    public static int isodd(int n) {
        if (n == 0) {
            return 1; // 0 is neither odd nor even
        } else if (n % 2 != 0) {
            return 2; // odd
        } else {
            return 1; // even
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isodd(n));
    }
}
