import java.util.*;
public class IsOdd{
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        int input1 = sc.nextInt();
         int variable = input1 % 2!=0 ? 2 : 1;
         System.out.print(variable);
        sc.close();
    }
}