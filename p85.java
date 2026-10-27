import java.util.*;
class p85
{
  public static void main(String args[])
   {

    int min,hrs,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any no= ");
    n=sc.nextInt();
    min=n%60;
    hrs=n/60;
    System.out.println("Min are= "+min);
    System.out.println("Hours are= "+hrs);
  
   }

}