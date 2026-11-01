import java.util.*;
class p109
{
 public static void main(String args[])
   {
      int yrs;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Any Year= ");
      yrs=sc.nextInt();
      if(yrs%4==0)
        {
         System.out.println("Enter year is leap year= "+yrs);
        }
      else
	{
         System.out.println("Enter year is not leap year"yrs);
        }
   }
}