import java.util.*;

public class vinod {
    public static int sum(int arr[], int index) {
        if (arr.length <= index) {
            return 0;
        }
        return arr[index] + sum(arr, index + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr, 0));
    }
}
