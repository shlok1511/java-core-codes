
import java.util.*;

class p141 {
    public static void main(String[] args) {
        int n, a;
        a = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no=");
        n = sc.nextInt();

        while (n >= a) {
            if (a % 2 == 0) {
                System.out.println(a + " is Even");
                
            }    
              a++;         
        }
    }
}
