import java.util.*;
class p77
{
 public static void main(String args[])
  {
   int x,y,a,b,c,d,e;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter no No1= ");
   x=sc.nextInt();
   System.out.print("Enter no No2=" );
   y=sc.nextInt();
   a=x+y;
   b=x-y;
   c=x*y;
   d=x/y;
   e=x%y;
   
   System.out.println("Addition= "+a);
   System.out.println("Substraction= "+b);
   System.out.println("Multiplictaion ="+c);
   System.out.println("Division= "+d);
   System.out.println("Modlus= "+e);
 
   }
}