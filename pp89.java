import java.util.*;
class pp89
{
 public static void main(String args[])
  {
   String c;
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any no= ");
   n=sc.nextInt();
   c=(n%2==0)? "even":"odd";
   System.out.println(c);
  }
}
