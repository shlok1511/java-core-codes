import java.util.*;
class p91
{
 public static void main(String args[])
  {
   String c;
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any no"); 
   n=sc.nextInt();
   c=(n%7==0)? "Divisble":"Not Divsible";
   System.out.println("Enter no is "+c+"by 7");
   }
}