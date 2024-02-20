import java.util.*;

public class vinod {
    public static int prime(int m,int n)
    {
        int count;
        int temp = 0;
        for (int i = m; i <= n; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1) {
                temp++;
            }
        }
        return temp;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int result=prime(m,n);
        
        System.out.println(result);
    }
}
