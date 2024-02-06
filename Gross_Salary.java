import java.util.*;

public class Vinod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int bs = sc.nextInt();
        double da = 0.0, hra = 0.0;

        if (bs <= 10000) {
            da = bs * 0.8;
            hra = bs * 0.2;
        } else if (bs <= 20000) {
            da = bs * 0.9;
            hra = bs * 0.25;
        } else if (bs > 20000) {
            da = bs * 0.95;
            hra = bs * 0.3;
        }

        double gs = bs + hra + da;
        System.out.printf("%.2f", gs);

        sc.close();
    }
}
