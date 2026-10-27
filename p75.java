import java.util.*;
class p75
{
 public static void main(String []args)
 {
 int a,b;
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter no1= ");
 a=sc.nextInt();
 System.out.print("Enter no2= ");
 b=sc.nextInt();
  a=a+b;
  b=a-b;
  a=a-b;
 System.out.println("After Swaping");
 System.out.println("No1= "+a);
 System.out.println("No2= "+b);
 }
}
