import java.util.*;
class p65
{
 public static void main(String args[])
   {
   float dis,avg,pet,exp;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Distance= ");
   dis=sc.nextFloat();
   System.out.println("Enter Average= ");
   avg=sc.nextFloat();
   System.out.println("Enter petrol rate= ");
   pet=sc.nextFloat();
   exp=(dis/avg)*pet;
  System.out.println("Petrol Expenses are="+exp);
   }
}