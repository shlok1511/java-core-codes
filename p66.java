import java.util.*;
class p66
{
 public static void main(String args[])
  {
   float a,r,d;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Area of Circle= ");
   a=sc.nextFloat();
   r=(float)Math.sqrt(a/3.14);
   System.out.println("Radius= "+r);
   d=2*r;
   System.out.println("Diameter= "+d);
  }
}