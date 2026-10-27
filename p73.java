import java.util.*;
class p73
{
 public static void main(String args[])
  {
   float f,c;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter celcius temp= ");
   c=sc.nextFloat();
   f=(c*9/5)+32;
   System.out.println("Celcius Converted to farahnite= "+f);
  }
}