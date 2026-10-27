import java.util.*;
class p81
{
 public static void main(String args[])				
  {
   int n,d1,d2,d3,sum;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any no= ");
      n=sc.nextInt();
    d3=n%10;
    n=n/10;
    d2=n%10;
    d1=n/10;
    sum=(d1+d2+d3);	
   System.out.println("Sum is= "+sum);
  }

}