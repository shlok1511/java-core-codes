import java.util.*;
class p74
{
 public static void main(String args[])
  {
   int a,b,c;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter no1= ");
   a=sc.nextInt();
   System.out.print("Enter no2= ");
   b=sc.nextInt();
   c=a;
   a=b;
   b=c;
  System.out.println("After Awaping");
  System.out.println("No1= "+a);
  System.out.println("No2= "+b);
  }
}