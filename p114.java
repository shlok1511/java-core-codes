import java.util.*;
class p114
{
 public static void main(String args[])
  {
   int n,rev,d1,d2,d3;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any no");
   n=sc.nextInt(); // 424
   int x = n;
   d3=n%10;
    n=n/10; //42
   d2=n%10;
   d1=n/10;
   rev=(d3*100)+(d2*10)+d1;
   System.out.println("Reverse no= "+rev);
   if(x==rev)
      System.out.println("No is Palidrome");
   else
       System.out.println("No is not Palidrome");
  }
}