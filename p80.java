import java.util.*;
class p80
{
 public static void main(String args[])
  {
   int n,d1,d2,d3,rev;
   Scanner sc=new Scanner (System.in);
   System.out.print("Enter any No=");
   n=sc.nextInt();
   d3=n%10;
   n=n/10;
   d2=n%10;
   d1=n/10;
   rev=(d3*100)+(d2*10)+d1;
   System.out.println("Reverse No is= "+rev);
  }
}