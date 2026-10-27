import java.util.*;
class p79
{
 public static void main(String args[])
  {
   int n,d1,d2,d3;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any three No=");
   n=sc.nextInt();
   d3=n%10;
    n=n/10;
   d2=n%10;
   d1=n/10;
  System.out.println("First No ="+d1);
  System.out.println("Second No="+d2);
  System.out.println("Third No="+d3);
  }
}