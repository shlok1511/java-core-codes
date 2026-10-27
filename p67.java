import java.util.*;
class p67
{
 public static void main(String args[])
  {
  Float pw,x,n;
  Scanner sc=new Scanner(System.in);
 
  System.out.print("Enter Number= ");
  n=sc.nextFloat();
  System.out.print("Enter Power no= ");
  x=sc.nextFloat();
  pw=(float)Math.pow(x,n);
  System.out.println("Power of Enter no is= "+pw);
 

  }
}