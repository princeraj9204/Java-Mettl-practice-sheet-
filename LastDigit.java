import java.util.*;
public class LastDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0) {
            n = n*(-1);
        }
        int lastdigit = n%10;
        System.out.print(lastdigit);
        sc.close();
    }  
}
