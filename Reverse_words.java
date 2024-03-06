import java.util.*;
public class ReverseWords {
    public static String reverseWords(String s) {
        // Split the input string into an array of words
        String[] words = s.trim().split("\s+");

        // Reverse the array of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        // Return the reversed string
        return reversed.toString();
    }

    public static void main(String[] args) {
        // Example usage
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String reversed = reverseWords(input);
        System.out.println(reversed);
    }
}
