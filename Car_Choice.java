import java.util.Scanner;

public class vinod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            double c1 = (double) y1 / x1; 
            double c2 = (double) y2 / x2; 
            if (c1 < c2) {
                System.out.println("-1");
            } else if (c1 == c2) {
                System.out.println("0");
            } else if (c1 > c2) {
                System.out.println("1");
            }
        }
    }
}
