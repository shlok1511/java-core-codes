import java.util.*;
class p115
{
 public static void main(String args[])
  {
     int n,d1,d2,d3,x,a;
  
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any three digit no.= ");
      n=sc.nextInt();
      x=n;
      d3=n%10;
      n=n/10;
      d2=n%10;
      d1=n/10;
      a=(d3*d3*d3)+(d2*d2*d2)+(d1*d1*d1);
      if(x==a)
       System.out.println("Enter no is Amstrong");
      else
        System.out.println("Enter no is not Amstrong");
  }
}