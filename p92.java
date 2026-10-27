import java.util.*;
class p92
{
 public static void main(String args[])
  {
    String e;
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter age of person= ");
    n=sc.nextInt();
    e=(n>=18)? "Eligible":"Not-Eligible";
    System.out.println("Enter age is "+e+"For Voting");
  
  }
}