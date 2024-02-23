import java.util.*;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char digits[]=s.toCharArray();
      
        for(int i=0;i<digits.length;i++)
        {
            if(digits[i]=='6')
            {
                digits[i]='9';
                break;
            }
        }
      String s2=new String(digits);
      System.out.println(s2);
       
    }
}
