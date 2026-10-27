import java.util.*;
class p83
{
 public static void main(String args[])
  {
   int n,d1,d2,d3,d4,rev;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter anyt 4 no.s= ");
     n=sc.nextInt();
   d4=n%10;
    n=n/10;
   d3=n%10;
    n=n/10;
   d2=n%10;
   d1=n/10;
   rev=(d4*1000)+(d3*100)+(d2*10)+d1;
   System.out.println("Reverse="+rev);
  }
}