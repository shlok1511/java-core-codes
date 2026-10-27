import java.util.*;
class p98
{
 public static void  main(String args[])
  {
   int n,sq;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any no= ");
   n=sc.nextInt();
   if(n>=0)
     {
       System.out.println("Enter No is positive");
       sq=n*n;
      System.out.println("Square is="+sq);
     }
   else
      {
        System.out.println("Enter No is negative ");
      }
   }
}