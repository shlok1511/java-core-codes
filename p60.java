
import java.util.*;

class p60
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        char ch;
        System.out.print("Enter a Capital Alphabet = ");
        ch = sc.next().charAt(0);

        ch = (char)(ch + 32);

        System.out.println("Converted Small Alphabet = " + ch);
    }
}
