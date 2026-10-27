import java.util.*;
class p64
{
 public static void main(String args[])
   {
    float p,r,t,si,tot;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter loan amount= ");
    p=sc.nextFloat();
    System.out.println("Enter Duration= ");
    r=sc.nextFloat();
    System.out.println("Enter Interest Rate= ");
    t=sc.nextFloat();
     si=(p*r*t)/100;
    System.out.println("the Simple Interset is = "+si);
    tot=si+p;
    System.out.println(" So total value after the Interest will be paid="+tot);
    

     }
}