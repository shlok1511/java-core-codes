import java.util.*;
class p102
{
 public static void main(String args[])
  {
    int a,b,c;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter any  Three nos= ");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
     if(a==b && b==c )
      {
       System.out.println("Enter no are Same....");
      }
      else if(a>=b && a>=c)
      {
        System.out.println("A is Max No= "+a);

       }
      else if(b>=a && b>=c)
       {
        System.out.println("B is Max no= "+b);
       }
      else 
        {
         System.out.println("C is Max No= "+c);
        }



  }
}